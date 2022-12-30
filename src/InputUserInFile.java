import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class InputUserInFile {

    /**Take input from user and store it in data.csv file as follows:

INPUT: (Enter your name: ) Mr.A
       (Enter your email: ) mr.a@gmail.com

ACTION: After the input, the data.csv file should look like this:
001, Mr.A, mr.a@gmail.com, true

INPUT: (Enter your name: ) Mr.B
       (Enter your email: ) mr.b@gmail.com

ACTION: After the input, the data.csv file should look like this:
002, Mr.B, mr.b@gmail.com, true
     * @param args
     */
    public static void main(String[] args) {
        try {

            File newFile= new File("dataCvs/datacvs.csv");
            
            if (newFile.exists()) {
                Scanner scanner1 = new Scanner(newFile);
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter the ID:");
                int ID = scanner.nextInt();
                System.out.println("Enter the name:");
                String name = scanner.next();
                System.out.println("Enter the email :");
                String email= scanner.next();
               
                try{

                    FileWriter newFile1= new FileWriter("dataCvs/datacvs.csv",true);
                        String storee[] = scanner.nextLine().split(",");
                        for (int i=0;i<storee.length;i++) {
                            System.out.println(Arrays.toString(storee));

                        
                    }
//                    newFile1.write(ID + " " + name + " "+ email);
                        scanner.close();
                        scanner1.close();
                    newFile1.close();
                } catch(IOException e){
                    e.printStackTrace();

                }





            } 

        
    }catch (Exception e) {
        System.out.println(e);

    }
}
}
