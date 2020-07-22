package A3;

import java.io.File;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        File file1 = new File("readme.txt");
        try{
            Scanner scanner = new Scanner(file1);
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("bad error" + e);
        }

        System.out.println("counting the eggs");
        int eggs = countEgg(file1);
        System.out.println("-----------------------\nWe need " + eggs + " eggs for the recipe");
    }

    public static int countEgg(File file){
        int counter = 0;
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String word = scanner.next();
                if(word.contains("egg")){
                    counter++;
                }
            }
            return counter;

        }
        catch (Exception e){
            System.out.println("good error" + e);
            return -1;
        }

    }
}
