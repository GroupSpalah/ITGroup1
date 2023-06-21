package homeworks.mihail_chursinov.hw_06_23.hw_02_06_23;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class ShowVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        File file = dir.toFile();
        String name = file.getName();
        System.out.println(name);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        File file1 = file.toFile();
        String dirName = file1.getName();
        System.out.println(dirName);
        return FileVisitResult.CONTINUE;
    }
}
