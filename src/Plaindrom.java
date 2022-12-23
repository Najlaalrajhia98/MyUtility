import java.util.BitSet;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class Plaindrom {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the word you want to check ");
       
       String inputString= sc.next();
       int firstIndex=0;
       int lastIndex = inputString.length()-1;
       
       while (lastIndex>firstIndex) 
       {
           if (inputString.charAt(firstIndex)!= inputString.charAt(lastIndex)) 
           {
               System.out.println("(FALSE) its NOT palindrome");
               System.exit(0);
               
           }
           // becouse its starting from index 0 of the string and forward 
           firstIndex++;
           // starting from the last element and decresing 
           lastIndex--;
       }
       System.out.println(" (TRUE) its palindrome");
    }
}