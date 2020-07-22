package A1;

import java.io.File;

public class A1 {

    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        try {
            if(file1.createNewFile());
        }
        catch (Exception e){
            System.out.println("Error" + e);

        }
    }
}
