import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 * Class to move specific files from one folder to another folder by reading a
 * text file which will have all the filenames as a list.
 *
 * @author Rishal
 *
 */
public class Testdd {
    public static void main(String[] args) throws IOException {

        // Path of the file which is having all the names of the files which we
        // want to move into another folder.
        String list = "C:\\Users\\Ar Kar\\Desktop\\From Folder\\TestFile2.txt";
        List listOfFileNamesToBeMoved = Files.readAllLines(Paths.get(list), Charset.forName("UTF-8"));

        // Input object to get input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading source and destination from the user
        System.out.println("Enter Source folder path:");
        String sourceFolder = br.readLine();

        System.out.println("Enter Target folder path:");
        String targetFolder = br.readLine();

        // Creating file object with source folder path passed as input by the
        // user.
        File directory = new File(sourceFolder);

        // getting list of all the files present in the source folder
        File[] fList = directory.listFiles();

        // Looping into each fileNames present in the listOfFiles.txt to check
        // if its present in the source folder and then move it into the target
        // folder
        for (Object loopInFileNames : listOfFileNamesToBeMoved) {
            for (File file : fList) { // looping into the Source Folder
                // fileNames

                // Matching the fileNames in the sourceFolder and list of files
                // supplied by the user.
                if (file.isFile() && file.getName().equals(loopInFileNames)) {
                    // Copying the file into the target folder.
                    Files.copy(file.toPath(), (new File(targetFolder + "\\" + file.getName())).toPath(),
                            StandardCopyOption.REPLACE_EXISTING);
                }
            }
            System.out.println(loopInFileNames + " :Files Copied Succesfully!");
        }
    }
}