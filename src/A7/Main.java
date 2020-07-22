package A7;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("words.txt");
        ArrayList<String> theArray = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file1);
            while(scanner.hasNext()){
                theArray.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        Collections.sort(theArray);

        File file2 = new File("sorted.txt");
        try{
            file2.createNewFile();
            FileWriter writer = new FileWriter(file2);

            for(String word : theArray){
                writer.write(word + "\n");
            }
            writer.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
