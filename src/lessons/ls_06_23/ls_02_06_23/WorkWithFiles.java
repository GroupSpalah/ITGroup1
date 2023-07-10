package lessons.ls_06_23.ls_02_06_23;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {

        Path pathToFile = Paths.get("./Poem.txt");// \-windows / - unix systems
        Path pathToDir = Paths.get("./work");// \-windows / - unix systems

//        Files.createFile(pathToFile);

//        Files.createDirectory(pathToDir);

//        Files.write(pathToFile, "World".getBytes(), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
//        Files.write(pathToFile, "Hello".getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);

//        byte[] bytes = Files.readAllBytes(pathToFile);

//        String text = new String(bytes);

//        System.out.println(text);

        Path pathSource = Paths.get("./source/Legend.txt");
        Path pathTarget = Paths.get("./target/Legend.txt");

//        Files.copy(pathSource, pathTarget, StandardCopyOption.REPLACE_EXISTING);

//        Files.delete(pathSource);

        Path pathHomework = Paths.get("./Homeworks");

//        Files.walkFileTree(pathHomework, new ShowVisitor());

        Path path = Paths.get("./GitKeyMaps.txt");

        convertTxtToPDf(path);

    }

    public static void convertTxtToPDf(Path pathToTxt) {
        Document document = new Document();

//        "HelloWorld.txt" -> "HelloWorld.pdf"

        String absolutePath = pathToTxt.toFile().getAbsolutePath();

        String pathToPdf = absolutePath.replace("txt", "pdf");

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pathToPdf));
            document.open();
            document.add(new Paragraph("A Hello World PDF document."));
            document.close();
            writer.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//class ShowVisitor implements FileVisitor<Path> {
class ShowVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        File file = dir.toFile();
        String fileName = file.getName();
        System.out.println(fileName);
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
