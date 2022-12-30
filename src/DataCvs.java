
import java.io.File;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class DataCvs {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try {

            File dataFile = new File("data/data.csv");
            if (dataFile.exists()) 
            {
                Scanner readFile = new Scanner(dataFile); 
                HashMap<String, String[]> store = new HashMap<>();
                
                while(readFile.hasNextLine()) 
                {
                    String storee[] = readFile.nextLine().split(",");
                    for (int i=0;i<storee.length;i++) 
                    {
                        store.put(storee[0], storee);

                    }
                }
                for (String key : store.keySet()) 
                {
                    System.out.println(Arrays.toString(store.get(key)));
                }


                readFile.close();
            }

        }catch (Exception e) {
            System.out.println("file dosent exist");
        }
    }
}