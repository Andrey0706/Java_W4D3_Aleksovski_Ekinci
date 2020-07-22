package A5;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

public class A5 {
    public static void main(String[] args) {
        Product product1 = new Product("Nutella", 2.50, 50000, "Hazelnut cocoa spread for adults");
        Product product2 = new Product("Chocolate", 1.50 , 250, "Bad for kids, good for papas");
        Product product3 = new Product("Coca Cola", 0.80, 25660, "Addictive should be refreshing but its not drink");


        HashMap<Integer, Product> products = new HashMap<Integer, Product>();

        products.put(product1.getID(), product1);
        products.put(product2.getID(), product2);
        products.put(product3.getID(), product3);

        for(int product : products.keySet()){
            System.out.printf("");
        }

        printReport(products);
    }

    public static void printReport(HashMap<Integer, Product> products){
        try {
            File file1 = new File("report.txt");
            file1.createNewFile();
            FileWriter writer = new FileWriter("report.txt");
            for(int i: products.keySet()){
                //System.out.printf("%s | %d | %d | %s");
                String line = products.get(i).getName() + " | " + products.get(i).getPrice() + " | " + products.get(i).getQuantity() + " | " + products.get(i).getDescription() + "\n";
                writer.write(line);
            }
            writer.close();

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
