
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Testdd3 {
    public static void main(String[]args){
        final String extension = ".docx";
       final File sourceDir = new File("C:\\Users\\Ar Kar\\Desktop\\From Folder");
        final File destinationDir = new File("C:\\Users\\Ar Kar\\Desktop\\To Folder");
        File[] files = sourceDir.listFiles((File pathname) -> !pathname.getName().endsWith(extension));
        for(File f : files ){
            Path sourcePath      = Paths.get(sourceDir.getAbsolutePath()+"\\"+f.getName());
            Path destinationPath = Paths.get(destinationDir.getAbsolutePath()+"\\"+f.getName());

            try {
                Files.move(sourcePath, destinationPath,StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                //moving file failed.
                e.printStackTrace();
            }
        }
    }
}