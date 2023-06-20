package mihail_chursinov.hw_06_06_23;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import homeworks.mihail_chursinov.hw_02_06_23.FileManager;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestFile {
    @Rule
    public SystemOutRule outRule = new SystemOutRule().enableLog();
    FileManager fileManager = new FileManager();
    @Rule
    public TemporaryFolder tf = new TemporaryFolder();

    @Test
    public void shouldCreateFile() throws IOException {
        File dir = tf.newFolder("movie");
        Path pathToFile = Paths.get(dir.getAbsolutePath(), "Legend.txt");
        fileManager.createFile(pathToFile);
        Assert.assertTrue(Files.exists(pathToFile));
    }

    @Test
    public void shouldCreateDir() throws IOException {
        File dir = tf.newFolder("movie");
        Path newDir = Paths.get(dir.getAbsolutePath(), "test");
        fileManager.createDir(newDir);
        Assert.assertTrue(Files.exists(newDir));
    }

    @Test
    public void shouldConvertTxtToPDf() throws IOException {
        File dir = tf.newFolder("movie");
        Path pathToFile = Paths.get(dir.getAbsolutePath(), "Test.txt");
        Files.write(pathToFile, "Hello".getBytes(), StandardOpenOption.CREATE);

        Path pathToFilePdf = Paths.get(dir.getAbsolutePath(), "Test.pdf");
        fileManager.convertTxtToPdf(pathToFile);

        PdfReader reader;
        try {

            reader = new PdfReader(pathToFilePdf.toFile().getAbsolutePath());

            // pageNumber = 1
            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

            System.out.println(textFromPage);

            reader.close();
            Assert.assertEquals("Hello", textFromPage);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void shouldCopyFile() throws IOException {
        File sourceDir = tf.newFolder("movie");
        File targetDir = tf.newFolder("audio");

        Path pathSource = Paths.get(sourceDir.getAbsolutePath(), "Legend.txt");

        Path pathTarget = Paths.get(targetDir.getAbsolutePath(), "Legend.txt");

        Files.write(pathSource, "Hello".getBytes(), StandardOpenOption.CREATE);

        fileManager.copyFile(pathSource, pathTarget);

        Assert.assertTrue(Files.exists(pathTarget));

        byte[] bytes = Files.readAllBytes(pathTarget);

        String text = new String(bytes);

        Assert.assertEquals(text, "Hello");
    }

    @Test
    public void shouldDeleteFile() throws IOException {
        File dir = tf.newFolder("movie");
        Path pathToFile = Paths.get(dir.getAbsolutePath(), "Test.txt");
        fileManager.createFile(pathToFile);
        fileManager.deleteFile(pathToFile);
        Assert.assertFalse(Files.exists(pathToFile));

    }

    @Test
    public void shouldDeleteWithFile() throws IOException {
        File dir = tf.newFolder("movie");
        String absolutePath = dir.getAbsolutePath();

        for (int i = 0; i < 5; i++) {
            Path path = Paths.get(absolutePath, "Legend" + i + ".txt");

            Files.createFile(path);
            fileManager.deleteDirWithFile(path);
        }
    }

    @Test
    public void shouldRenameFile() throws IOException {
        File dir = tf.newFolder("movie");
        File dir2 = tf.newFolder("movie2");
        Path pathFile = Paths.get(dir.getAbsolutePath(), "Test.txt");
        Path pathFile1 = Paths.get(dir2.getAbsolutePath(), "Test2.txt");
        fileManager.createFile(pathFile);
        fileManager.createFile(pathFile1);
        fileManager.renameFile(pathFile, pathFile1);
        Assert.assertTrue(Files.exists(pathFile1));

    }

    @Test
    public void showDir() throws IOException {
        File dir = tf.newFolder("movie");
        String absolutePath = dir.getAbsolutePath();
        Path path = Paths.get(absolutePath, "Legend.txt");

        Files.createFile(path);
        fileManager.showDir(dir.toPath());
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("movie"));
        Assert.assertTrue(log.contains("Legend.txt"));
    }
}
