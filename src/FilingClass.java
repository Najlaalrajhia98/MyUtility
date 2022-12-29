import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class FilingClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
        File dataFile=new File("data/data.txt");
        try {
            Scanner fileScanner=new Scanner(dataFile);
          
          
          while(fileScanner.hasNextLine()) {
              System.out.println(fileScanner.nextLine());
          }
          
         
          // if we didnt close it then there is a possiblitly of memory leak
          fileScanner.close();
        } // maybe we didnt creat the file so we have to handle the exception  
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } try {
            FileWriter newFile= new FileWriter(FilingClass.DATA_FILE_PATH,true);
            
            newFile.write("I am empty right now put something please!\n");
            newFile.write("I am empty right now put something please!\n");
            newFile.write("I am empty right now put something please!\n");
            
            newFile.close();
            
            
        } catch (IOException e) {
            // TODO: handle exception
        }
    }public static final String DATA_FILE_PATH="data/data.txt";

    
}
