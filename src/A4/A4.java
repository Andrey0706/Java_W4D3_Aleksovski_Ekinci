package A4;

import java.io.File;

public class A4 {
    public static void main(String[] args) {
        try {
            File file1 = new File("file1.txt");
            file1.delete();
        }
        catch (Exception e){
            System.out.println("error" + e);
        }

    }
}
