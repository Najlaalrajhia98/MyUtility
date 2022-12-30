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
     * Take input from user and store it in data.csv file as follows:

INPUT: (Enter your name: ) Mr.A
       (Enter your email: ) mr.a@gmail.com

ACTION: After the input, the data.csv file should look like this:
001, Mr.A, mr.a@gmail.com, true

INPUT: (Enter your name: ) Mr.B
       (Enter your email: ) mr.b@gmail.com
 
ACTION: After the input, the data.csv file should look like this:
002, Mr.B, mr.b@gmail.com, true
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
