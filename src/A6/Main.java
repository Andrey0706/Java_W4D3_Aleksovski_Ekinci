package A6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("readme.txt");
        try {

            String content = new String(Files.readAllBytes(Paths.get(file1.getPath())));
            System.out.println(content);
        } catch (Exception e) {
            System.out.println(e);
        }

        ArrayList<String> theArray = new ArrayList<>();

        try {
            // FileReader reader = new FileReader(file1);
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNext()) {
                theArray.add(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("----Read into array list----");

        for (String line : theArray) {
            System.out.println(line);
        }

        System.out.println("-------Buffered reader-----");
        ArrayList<String> listOfLines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            String line = reader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        for (String line : listOfLines) {
            System.out.println(line);

        }

    }
}
