package anton_gvozdenko;

import homeworks.anton_gvozdenko.hw_02_06_23.DeleteVisitor;
import homeworks.anton_gvozdenko.hw_02_06_23.FileManager;
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

public class TestWithTempFolder {
    @Rule
    public TemporaryFolder tf = new TemporaryFolder();

    @Test
    public void shouldCreateFile() throws IOException {
        File newDir = tf.newFolder("New folder");
        Path newFile = Paths.get(newDir.getAbsolutePath(), "new file.txt");
        new FileManager().createFile(newFile);
        Assert.assertTrue(Files.exists(newFile));
    }

    @Test
    public void shouldCreateDir() throws IOException {
        File newFolder = tf.newFolder("Folder");
        Path newDir = Paths.get(newFolder.getAbsolutePath(), "new folder");
        new FileManager().createDirectory(newDir);
        Assert.assertTrue(Files.exists(newDir));
    }

    @Test
    public void shouldCopyFile() throws IOException {
        File newSourceFolder = tf.newFolder("Folder");
        File newTargetFolder = tf.newFolder("Directory");

        Path pathSource = Paths.get(newSourceFolder.getAbsolutePath(), "World.txt");

        Path pathTarget = Paths.get(newTargetFolder.getAbsolutePath(), "World.txt");

        Files.write(pathSource, "Smile".getBytes(), StandardOpenOption.CREATE);

        FileManager.copyFile(pathSource, pathTarget);

        Assert.assertTrue(Files.exists(pathTarget));

        byte[] bytes = Files.readAllBytes(pathTarget);

        String text = new String(bytes);

        Assert.assertEquals(text, "Smile");
    }

    @Test
    public void shouldDeleteFile() throws IOException {
        File newFolder = tf.newFolder("Folder");
        Path newFile = Paths.get(newFolder.getAbsolutePath(), "new file.txt");
        new FileManager().deleteFile(newFile);
        Assert.assertTrue(Files.notExists(newFile));
    }

    @Test
    public void shouldDeleteDirectory() throws IOException {
        File newFolder = tf.newFolder("Folders");
        Path newDir = Paths.get(newFolder.getAbsolutePath(), "Dir", "File.txt");
        new FileManager().deleteDirWithFile(newDir);
        Assert.assertTrue(Files.notExists(newDir));
    }

    @Test
    public void shouldRenameFile() throws IOException {
        File newFolder = tf.newFolder("Folder");
        Path pathFile = Paths.get(newFolder.getAbsolutePath(), "World.txt");
        Path pathTarget = Paths.get(newFolder.getAbsolutePath(), "War.txt");
        new FileManager().renameFile(pathFile, pathTarget);
        Assert.assertEquals("World.txt", "War.txt");
    }

    @Test
    public void shouldRenameDir() throws IOException {
        File newFolder = tf.newFolder("Folder");
        Path pathDir = Paths.get(newFolder.getAbsolutePath(), "Homework");
        Path pathNewName = Paths.get(newFolder.getAbsolutePath(), "ClassWork");
        new FileManager().renameDirectory(pathDir, pathNewName);
        Assert.assertEquals("Homework", "ClassWork");
    }

    @Test
    public void shouldVisitDirectory() throws IOException {
        File newFolder = tf.newFolder("Folders");
        Path dir = Paths.get(newFolder.getAbsolutePath(), "Directory");
        new FileManager().visitDirectory(dir);
        Assert.assertTrue(Files.exists(dir));

    }

}

