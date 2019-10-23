package com.csair.b2c.cloud.test.learn.java.zip;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import lombok.SneakyThrows;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StreamUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author yudong
 * @date 2019/7/10
 */
public class ZipTest {
    static File testZipFile = null;

    @BeforeClass
    @SneakyThrows
    public static void init() {
        testZipFile = ResourceUtils.getFile("classpath:zip/test-zip-file.zip");
    }

    @Test
    @SneakyThrows
    public void testNioUnzipAndSave() {
        final Path destDir = Paths.get("D:\\zip");
        if (destDir.toFile().exists()) {
            FileSystemUtils.deleteRecursively(destDir.toFile());
        }
        destDir.toFile().mkdir();
        try (FileSystem zipFileSystem = FileSystems
                .newFileSystem(testZipFile.toPath(), null)) {
            Path top = zipFileSystem.getPath("/");
            Files.walk(top).skip(1)
                    .forEach(file -> {
                        Path target = destDir.resolve(top.relativize(file).toString());
                        try {
                            Files.copy(file, target, REPLACE_EXISTING);
                            if (file.toString().contains("taseditor_patterns.txt")) {
                                String string = FileCopyUtils.copyToString(Files.newBufferedReader(file, Charset.forName("GBK")));
                                System.out.println(string);
                            }
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    });
        }
    }

    @Test
    @SneakyThrows
    public void testOldUnzip() {
        ZipFile zipFile = new ZipFile(testZipFile, StandardCharsets.UTF_8);
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        while (enumeration.hasMoreElements()) {
            ZipEntry zipEntry = enumeration.nextElement();
            if (zipEntry.getName().contains("taseditor_patterns.txt")) {
                String string = StreamUtils.copyToString(zipFile.getInputStream(zipEntry), Charset.forName("GBK"));
                System.out.println(string);
            }
        }
    }

    @Test
    @SneakyThrows
    public void testOldUnzipAndSave() {
        final Path destDir = Paths.get("D:\\zip");
        if (destDir.toFile().exists()) {
            FileSystemUtils.deleteRecursively(destDir.toFile());
        }
        destDir.toFile().mkdir();
        FileUnzipper fileUnzipper = new FileUnzipper(testZipFile.getParent(), "test-zip-file.zip", destDir.toFile().getAbsolutePath());
        fileUnzipper.unzip();
    }

    @Test
    @SneakyThrows
    public void testGzip() {
        final Path destDir = Paths.get("D:\\zip");
        if (destDir.toFile().exists()) {
            FileSystemUtils.deleteRecursively(destDir.toFile());
        }
        destDir.toFile().mkdir();
        try (
                FileOutputStream outputStream = new FileOutputStream(new File(destDir.toFile(), "gzip.zip"));
                GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream)
        ) {
            File file = ResourceUtils.getFile("classpath:book.json");
            byte[] data = StreamUtils.copyToByteArray(new FileInputStream(file));
            gzipOutputStream.write(data);
        }
    }

    @Test
    @SneakyThrows
    public void testGzipUnzip() {
        File file = new File("D:\\zip\\gzip.zip");
        try (GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream(file))) {
            String s = StreamUtils.copyToString(gzipInputStream, StandardCharsets.UTF_8);
            System.out.println(s);
        }
    }
}
