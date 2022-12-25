
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class RecursionPractice {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int num=5;
        factorial(num);
        System.out.println(factorial(num));
        
        
        String aString= "kill";
        int i=0;
        System.out.print(reverString(aString,i));
        System.out.println();
        reverNum(i);
    }


   


    public static int factorial (int num) {
        if (num==0) {
            return 1; 
        }

        return num*factorial(num-1);
    }


    public static char reverString(String aString, int i ){
      
      if(i==aString.length()) {
          return ' ' ;
      } 
      reverString(aString,i+1);
      System.out.print(aString.charAt(i));
      
      
      return ' ';
      
    
} 

    public static int reverNum(int i){
        
        if(i==4) {
            return 0 ;
            
        } 
        
        
        System.out.print(i+" ");
        
        reverNum(i+1);
        
        System.out.print(i+" ");
        
        
        return 0;
    }
}
      