package A2;

import java.io.FileWriter;

public class A2 {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file1.txt");
            writer.write("First line of file");
            writer.close();
        }
        catch (Exception e){
            System.out.println("Error writing" + e);
        }
    }
}