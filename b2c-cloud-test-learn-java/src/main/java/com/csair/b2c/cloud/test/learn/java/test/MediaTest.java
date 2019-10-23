package com.csair.b2c.cloud.test.learn.java.test;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.springframework.util.StreamUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;

/**
 * Created on 2019/4/28.
 *
 * @author yudong
 */
public class MediaTest {

    @Test
    public void test() throws Exception {
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            String source = "https://tmallapi.bluemoon.com.cn/img/group1/M00/02/D0/wKjwDlzBYmGEF8GJAAAAAJ0jzdc734.mp4";
            URL url = new URL(source);
            inputStream = url.openConnection().getInputStream();
            File file = Files.createTempFile(RandomStringUtils.randomAlphabetic(6), "mp4").toFile();
            outputStream = new FileOutputStream(file);
            StreamUtils.copy(inputStream, outputStream);
            Encoder encoder = new Encoder();
            MultimediaInfo m = encoder.getInfo(file);
            long ls = m.getDuration();
            System.out.println(ls + "ms");
            file.delete();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
