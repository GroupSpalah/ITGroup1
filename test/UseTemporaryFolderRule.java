import homeworks.mihail_chursinov.hw_06_23.hw_02_06_23.FileManager;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class UseTemporaryFolderRule {

    @Rule
    public TemporaryFolder tf = new TemporaryFolder();

    @Test
    public void useTemporaryFolder() throws IOException {
        File file = tf.newFolder("movie", "test");

        File file1 = tf.newFile("Legend.txt");

        String absolutePath = file.getAbsolutePath();

        for (int i = 0; i < 5; i++) {
            Path path = Paths.get(absolutePath, "Legend" + i + ".txt");

            Files.createFile(path);
        }

        System.out.println();

//        Assert.assertTrue(Files.exists(absolutePath));
    }

    @Test
    public void shouldCopyFile() throws IOException {
        File sourceDir = tf.newFolder("movie");
        File targetDir = tf.newFolder("audio");

        Path pathSource = Paths.get(sourceDir.getAbsolutePath(), "Legend.txt");

        Path pathTarget = Paths.get(targetDir.getAbsolutePath(), "Legend.txt");

        Files.write(pathSource, "Hello".getBytes(), StandardOpenOption.CREATE);

        new FileManager().copyFile(pathSource, pathTarget);

        Assert.assertTrue(Files.exists(pathTarget));

        byte[] bytes = Files.readAllBytes(pathTarget);

        String text = new String(bytes);

        Assert.assertEquals(text, "Hello");
    }

    @Test
    public void shouldCreateFile() throws IOException {
        File dir = tf.newFolder("movie");

        Path pathToFile = Paths.get(dir.getAbsolutePath(), "Legend.txt");

        new FileManager().createFile(pathToFile);

        Assert.assertTrue(Files.exists(pathToFile));
    }
}
