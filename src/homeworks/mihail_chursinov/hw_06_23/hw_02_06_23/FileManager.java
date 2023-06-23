package homeworks.mihail_chursinov.hw_06_23.hw_02_06_23;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;

/**
 * 1) Создать приложение файловый менеджер.
 * Приложение должно позволять:
 * 1) Создавать текстовые файлы и директории
 * 2) Конвертацию текстовых файлов в PDF файлы с помощью библиотеки iText
 * (http://howtodoinjava.com/apache-commons/create-pdf-files-in-java-itext-tutorial/#itext_overview)
 * (https://mkyong.com/java/itext-read-and-write-pdf-in-java/ - чтение pdf файлов (для тестов))
 * 3) Копировать файлы из одной директории в другую, если такой файл уже существует - перезатирать его
 * 4) Удалять дирекотрии и файлы
 * 5) Переименовывать директории и файлы
 * 6) Просматривать содержимое директории
 * <p>
 * Использовать class Files
 */

public class FileManager {
    public void createFile(Path path) throws IOException {
        Files.createFile(path);
    }

    public void createDir(Path path) throws IOException {
        Files.createDirectory(path);

    }

    private String readFile(Path path) throws IOException {
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes);

    }

    public void convertTxtToPdf(Path path) throws IOException {
        Document document = new Document();

        String absolutePath = path.toFile().getAbsolutePath();
        String text = readFile(path);
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

    public void copyFile(Path source, Path target) throws IOException {
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }

    public void deleteFile(Path path) throws IOException {
        Files.delete(path);
    }

    public void deleteDirWithFile(Path path) throws IOException {
        Files.walkFileTree(path, new DeleteVisitor());
    }

    public void renameFile(Path source, Path target) throws IOException {
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
    }

    public void renameDir(Path source, Path target) throws IOException {
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
    }

    public void showDir(Path path) throws IOException {
        Files.walkFileTree(path, new ShowVisitor());
    }
}

