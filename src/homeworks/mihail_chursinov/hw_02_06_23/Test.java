package homeworks.mihail_chursinov.hw_02_06_23;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        FileManager fileManager = new FileManager();
        Path source = Paths.get("./movie/test.txt");
        Path target = Paths.get("./movie1/test2.txt");
        Path path = Paths.get("./GitKeyMaps.txt");

  //      fileManager.createDir(source);
//        fileManager.createFile(source);
//        fileManager.copyFile(source, target);
//       fileManager.deleteFile(target);
//        fileManager.deleteDirWithFile(target);
 //       fileManager.renameFile(source, target);
//        fileManager.renameDir(source, target);
//        fileManager.deleteDirWithFile(target);
//        fileManager.showDir(source);
  //      fileManager.convertTxtToPdf(path);//???
    }
}
