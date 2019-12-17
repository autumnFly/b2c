package com.csair.b2c.cloud.test.learn.java.ftp;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.util.Assert;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.FileSystemException;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.stream.Collectors;

/**
 * @author yudong
 * @date 2019/12/16
 */
public class SftpClient {

    private ChannelSftp channelSftp;

    private Session session;
    /**
     * SFTP 登录用户名
     */
    private String username;
    /**
     * SFTP 登录密码
     */
    private String password;
    /**
     * 私钥
     */
    private String privateKey;
    /**
     * SFTP 服务器地址IP地址
     */
    private String host;
    /**
     * SFTP 端口
     */
    private int port;


    /**
     * 构造基于密码认证的sftp对象
     */
    SftpClient(String username, String password, String host, int port) {
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
    }

    /**
     * 构造基于秘钥认证的sftp对象
     */
    public SftpClient(String username, String host, int port, String privateKey) {
        this.username = username;
        this.host = host;
        this.port = port;
        this.privateKey = privateKey;
    }

    /**
     * 连接sftp服务器
     */
    @SneakyThrows
    void connect() {
        JSch jsch = new JSch();
        if (privateKey != null) {
            // 设置私钥
            jsch.addIdentity(privateKey);
        }
        session = jsch.getSession(username, host, port);
        if (password != null) {
            session.setPassword(password);
        }
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect();
        Channel channel = session.openChannel("sftp");
        channel.connect();
        channelSftp = (ChannelSftp) channel;
    }

    /**
     * 关闭连接
     */
    void disconnect() {
        if (channelSftp != null) {
            if (channelSftp.isConnected()) {
                channelSftp.disconnect();
            }
        }
        if (session != null) {
            if (session.isConnected()) {
                session.disconnect();
            }
        }
    }


    /**
     * 将输入流的数据上传到sftp作为文件。文件完整路径=basePath+directory
     *
     * @param basePath     服务器的基础路径
     * @param directory    上传到该目录
     * @param sftpFileName sftp端文件名
     * @param input        输入流
     */
    @SneakyThrows
    public void upload(String basePath, String directory, String sftpFileName, InputStream input) {
        try {
            channelSftp.cd(basePath);
            channelSftp.cd(directory);
        } catch (SftpException e) {
            //目录不存在，则创建文件夹
            String[] dirs = directory.split("/");
            String tempPath = basePath;
            for (String dir : dirs) {
                if (null == dir || "".equals(dir)) continue;
                tempPath += "/" + dir;
                try {
                    channelSftp.cd(tempPath);
                } catch (SftpException ex) {
                    channelSftp.mkdir(tempPath);
                    channelSftp.cd(tempPath);
                }
            }
        }
        channelSftp.put(input, sftpFileName);
    }


    /**
     * 下载文件
     *
     * @param directory    下载目录
     * @param downloadFile 下载的文件
     * @param saveFile     存在本地的完整路径
     */
    @SneakyThrows
    void download(String directory, String downloadFile, String saveFile) {
        Assert.hasText(directory, "directory can't be blank");
        channelSftp.cd(directory);
        channelSftp.get(downloadFile, new FileOutputStream(saveFile));
    }

    /**
     * 下载文件
     *
     * @param directory    下载目录
     * @param downloadFile 下载的文件名
     * @return 字节数组
     */
    @SneakyThrows
    public byte[] download(String directory, String downloadFile) {
        Assert.hasText(directory, "directory can't be blank");
        channelSftp.cd(directory);
        InputStream is = channelSftp.get(downloadFile);
        return IOUtils.toByteArray(is);
    }

    @SneakyThrows
    public void downloadLogFiles(String logPath, String savePath, String currentFileName, String historyFileNamePrefix) {
        File path = new File(savePath);
        if (!path.exists()) {
            boolean success = path.mkdirs();
            if (!success) {
                throw new FileSystemException("can't create path " + password);
            }
        }
        String saveFile = savePath + "/" + currentFileName;
        download(logPath, currentFileName, saveFile);
        System.out.println(String.format("download %s to %s finished", currentFileName, saveFile));
        List<String> fileNames = getFileNames(logPath, historyFileNamePrefix);
        for (String fileName : fileNames) {
            saveFile = savePath + "/" + fileName;
            download(logPath, fileName, saveFile);
            System.out.println(String.format("download %s to %s finished", fileName, saveFile));
        }
    }

    List<String> getFileNames(String directory, String prefix) {
        return listFiles(directory).stream()
                .filter(lsEntry -> lsEntry.getFilename().startsWith(prefix))
                .map(ChannelSftp.LsEntry::getFilename)
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * 删除文件
     *
     * @param directory  要删除文件所在目录
     * @param deleteFile 要删除的文件
     */
    @SneakyThrows
    public void delete(String directory, String deleteFile) {
        channelSftp.cd(directory);
        channelSftp.rm(deleteFile);
    }


    /**
     * 列出目录下的文件
     *
     * @param directory 要列出的目录
     */
    @SneakyThrows
    Vector<ChannelSftp.LsEntry> listFiles(String directory) {
        return channelSftp.ls(directory);
    }
}
