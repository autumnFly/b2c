package com.csair.b2c.cloud.test.learn.java.ftp;

import lombok.extern.slf4j.Slf4j;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2019/12/16
 */
@Slf4j
public class SftpTest {
    private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    @Test
    public void test() {
        SftpClient sftpClient = new SftpClient(BlueMoonConsts.SftpServer.TEST_USERNAME, BlueMoonConsts.SftpServer.TEST_PASSWORD,
                BlueMoonConsts.SftpServer.SERVER_17, BlueMoonConsts.SftpServer.PORT);
        try {
            sftpClient.connect();
            List<String> fileNames = sftpClient.getFileNames(BlueMoonConsts.LogPath.CONTROL, "out.log.2019-12-1");
            sftpClient.disconnect();
            System.out.println(fileNames);
        } catch (Exception e) {
            log.error("error", e);
        } finally {
            sftpClient.disconnect();
        }
    }

    @Test
    public void testPrdControl() throws Exception {
        executorService.submit(() -> {
            SftpClient sftpClient = new SftpClient(BlueMoonConsts.SftpServer.PRD_USERNAME, BlueMoonConsts.SftpServer.PRD_PASSWORD,
                    BlueMoonConsts.SftpServer.SERVER_98, BlueMoonConsts.SftpServer.PORT);
            try {
                sftpClient.connect();
                sftpClient.downloadLogFiles(BlueMoonConsts.LogPath.CONTROL, "G:/logs/control/logs1",
                        "out.log", "out.log.2019-12-1");
            } catch (Exception e) {
                log.error("error", e);
            } finally {
                sftpClient.disconnect();
            }
        });

        executorService.submit(() -> {
            SftpClient sftpClient = new SftpClient(BlueMoonConsts.SftpServer.PRD_USERNAME, BlueMoonConsts.SftpServer.PRD_PASSWORD,
                    BlueMoonConsts.SftpServer.SERVER_99, BlueMoonConsts.SftpServer.PORT);
            try {
                sftpClient.connect();
                sftpClient.downloadLogFiles(BlueMoonConsts.LogPath.CONTROL, "G:/logs/control/logs2",
                        "out.log", "out.log.2019-12-1");
            } catch (Exception e) {
                log.error("error", e);
            } finally {
                sftpClient.disconnect();
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.SECONDS);
    }

    @Test
    public void testPrdMana() throws Exception {
        executorService.submit(() -> {
            SftpClient sftpClient = new SftpClient(BlueMoonConsts.SftpServer.PRD_USERNAME, BlueMoonConsts.SftpServer.PRD_PASSWORD,
                    BlueMoonConsts.SftpServer.SERVER_100, BlueMoonConsts.SftpServer.PORT);
            try {
                sftpClient.connect();
                sftpClient.downloadLogFiles(BlueMoonConsts.LogPath.MANA, "G:/logs/mana/logs1",
                        "out.log", "out.log.2019-12-1");
            } catch (Exception e) {
                log.error("error", e);
            } finally {
                sftpClient.disconnect();
            }
        });

        executorService.submit(() -> {
            SftpClient sftpClient = new SftpClient(BlueMoonConsts.SftpServer.PRD_USERNAME, BlueMoonConsts.SftpServer.PRD_PASSWORD,
                    BlueMoonConsts.SftpServer.SERVER_101, BlueMoonConsts.SftpServer.PORT);
            try {
                sftpClient.connect();
                sftpClient.downloadLogFiles(BlueMoonConsts.LogPath.MANA, "G:/logs/mana/logs2",
                        "out.log", "out.log.2019-12-1");
            } catch (Exception e) {
                log.error("error", e);
            } finally {
                sftpClient.disconnect();
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.SECONDS);
    }

}
