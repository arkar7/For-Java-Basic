//import java.io.*;
//public class Testf {
//    public static void main(String[] args) throws IOException {
//        PrintWriter my_pw = new PrintWriter("C:\\Users\\Ar Kar\\Desktop\\file3.txt");
//        BufferedReader my_br = new BufferedReader(new FileReader("C:\\Users\\Ar Kar\\Desktop\\file1.txt"));
//        String my_line = my_br.readLine();
//        while (my_line != null) {
//            my_pw.println(my_line);
//            my_line = my_br.readLine();
//        }
//        my_br = new BufferedReader(new FileReader("C:\\Users\\Ar Kar\\Desktop\\file2.txt"));
//        my_line = my_br.readLine();
//        while(my_line != null) {
//            my_pw.println(my_line);
//            my_line = my_br.readLine();
//        }
//        my_pw.flush();
//        my_br.close();
//        my_pw.close();
//        System.out.println("The first two files have been merged into the third file successfully.");
//    }
//}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Testf {

    public static void main(String[] args) throws IOException {

        List<String> students = Files.readAllLines(Paths.get("C:\\Users\\Ar Kar\\Desktop\\file1.txt"));
        List<String> grades = Files.readAllLines(Paths.get("C:\\Users\\Ar Kar\\Desktop\\file2.txt"));

        List<String> results = new ArrayList<>();

        results.add("2021083001001 CAR1 2010 Inservice\n" +
                "2021083101001 CAR2 2017 Sales\n" +
                "2021083101002 CAR3 2017 Sales\n" +
                "2021090101001 CAR4 2019 Inservice\n" +
                "2021090101002 CAR5 2007 Inservice\n" +
                "2021090101003 CAR6 2018 Inservice\n" +
                "2021090101004 CAR1 2010 Soldout\n" +
                "2021090201001 CAR2 2017 Sales\n" +
                "2021090201002 CAR3 2017 Sales\n" +
                "2021090201003 CAR4 2019 Inservice\n" +
                "2021090201004 CAR5 2007 Soldout\n" +
                "2021090201005 CAR6 2018 Soldout\n");

        // remove header lines
        students.remove(0);
        grades.remove(0);

        for(String student : students) {
            String[] s = student.split(",");
            for(String grade : grades) {
                String[] g = grade.split(",");
                if(Objects.equals(s[0], g[0])) {
                    results.add(s[0] + "," + s[1] + "," + ((Integer.parseInt(g[1]) + Integer.parseInt(g[2]) + Integer.parseInt(g[3]))/3) + "," + g[4] + "," + g[5] + "," + s[3]);
                }
            }
        }

        Files.write(Paths.get("C:\\Users\\Ar Kar\\Desktop\\file3.txt"), results);

    }
}