import java.io.File;
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
public class InputUserToFile {

    /**
     * @param args
     */
    
    public static void main(String[] args) {


        try {
            File dataFile = new File("dataCvs/datacvs.csv");
            FileWriter writer= new FileWriter("dataCvs/datacvs.csv",true);

            if (dataFile.exists()) {
                Scanner inputScanner = new Scanner(System.in); 
                System.out.println("Enter the id :");
                int id = inputScanner.nextInt();
                System.out.println("Enter the name :");
                String name  = inputScanner.next();
                System.out.println("Enter the email :");
                String email = inputScanner.next();
                
                writer.write(id+","+name+","+email+","+"true"+"\n");
                
              inputScanner.close();  
            }writer.close();
            
        } 

        catch (IOException e) {
            System.out.println("file is in use or open");
            e.printStackTrace();
        }
    }

}
