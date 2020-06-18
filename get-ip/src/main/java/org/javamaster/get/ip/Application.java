package org.javamaster.get.ip;

import java.io.File;
import java.io.FileWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author yudong
 * @date 2020/6/18
 */
public class Application {

    static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) throws Exception {
        while (true) {
            StringBuilder content = new StringBuilder();
            content.append("127.0.0.1     localhost\n");
            content.append("::1           ip6-localhost\n");
            String ip = "";
            Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = allNetInterfaces.nextElement();
                if (!netInterface.isLoopback() && !netInterface.isVirtual() && netInterface.isUp()) {
                    Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        InetAddress inetAddress = addresses.nextElement();
                        if (inetAddress instanceof Inet4Address) {
                            if (inetAddress.getHostAddress().startsWith("10.1")) {
                                ip = inetAddress.getHostAddress();
                            }
                        }
                    }
                }
            }
            content.append(ip).append("      agent.javamaster.org\n");

            FileWriter fileWriter = null;
            try {
                File file = new File("D:\\User\\天天共享文件夹\\hosts.txt");
                fileWriter = new FileWriter(file);
                fileWriter.write(content.toString());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
            logger.info(ip);
            TimeUnit.SECONDS.sleep(3);
        }

    }

}
