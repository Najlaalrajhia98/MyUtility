import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class UppercaseFile {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        try {
            
        
       File newfile= new File("data/Result.txt");
       if (newfile.createNewFile()) 
       {
           System.out.println("done creating the file");
           
       }
       File dataFile = new File("data/input.txt");
       if (dataFile.exists()) {
       Scanner readScanner =  new Scanner(dataFile);
       FileWriter fileWriter= new FileWriter("data/Result.txt",true);
       
       while (readScanner.hasNext()) {
           fileWriter.write(readScanner.nextLine().toUpperCase()+"\n");
           
       }
       fileWriter.close();
       readScanner.close();
    
    }
        }catch (Exception e) {
        // TODO: handle exception
    }

}
}
