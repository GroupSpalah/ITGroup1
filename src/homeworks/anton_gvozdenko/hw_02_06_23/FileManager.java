package homeworks.anton_gvozdenko.hw_02_06_23;

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


public class FileManager {

    public  void createDirectory(Path pathToDirectory) throws IOException {
        Files.createDirectory(pathToDirectory);
    }

    public   void createFile(Path pathToFile) throws IOException {
        Files.createFile(pathToFile);
    }



    public String readFile(Path pathToFile) throws IOException {
        byte[] bytes = Files.readAllBytes(pathToFile);
      return new String(bytes);
    }

    public static void copyFile(Path pathToFile,Path pathOutPut) throws IOException {
        Files.copy(pathToFile, pathOutPut, StandardCopyOption.REPLACE_EXISTING);
    }

    public  void  deleteFile(Path pathToFile) throws IOException {
        Files.delete(pathToFile);
    }
        public  void  deleteDirWithFile(Path pathToDirectory) throws IOException {
        Files.walkFileTree(pathToDirectory,new DeleteVisitor());

    }

    public  void visitDirectory(Path pathToDirectory) throws IOException {
        Files.walkFileTree(pathToDirectory,new  DeleteVisitor ());
    }

    public  void renameFile(Path pathToFile,Path pathToTarget) throws IOException {
        Files.move(pathToFile, pathToTarget,StandardCopyOption.ATOMIC_MOVE);
    }
    public  void renameDirectory(Path pathToFile,Path pathToTarget) throws IOException {
        Files.move(pathToFile, pathToTarget,StandardCopyOption.ATOMIC_MOVE);
    }

    public  void convertTxtToPDf(Path pathToTxt) throws IOException {

        Document document = new Document();

        String absolutePath = pathToTxt.toFile().getAbsolutePath();
        String text = readFile(pathToTxt);
        String pathToPdf = absolutePath.replace("txt", "pdf");

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pathToPdf));
            document.open();
            document.add(new Paragraph(text));
            document.close();
            writer.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    class Visitor extends SimpleFileVisitor<Path> {
        @Override

        public FileVisitResult preVisitDirectory(Path dirPath, BasicFileAttributes attrs) throws IOException {
            File file = dirPath.toFile();
            String fileName = file.getName();
            System.out.println(fileName);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path filePath, BasicFileAttributes attrs) throws IOException {
            File newFile = filePath.toFile();
            String dirName = newFile.getName();
            System.out.println(dirName);
            return FileVisitResult.CONTINUE;
        }

    }
}

class Test {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("./hw_02_06_23/Hello.txt");
        Path dirPath = Paths.get("./Homework");
         FileManager manager = new FileManager();
        manager.createDirectory(dirPath);

        manager.copyFile(filePath,filePath);
        manager.readFile(filePath);
       manager.visitDirectory(dirPath);
         manager.convertTxtToPDf(filePath);
         manager.deleteFile(filePath);


    }
}