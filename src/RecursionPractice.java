
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class RecursionPractice {

    /** Calculate power, given the base and exponent.
    INPUT:  {'base': 2, 'exponent': 3}
    OUTPUT: {'result': 8}
    
3) Reverse a string.
    INPUT:  "this is a sentence"
    OUTPUT: "ecnetnes a si siht"
    
4) Calculate factorial, given a positive number.
    INPUT:  5
    OUTPUT: 120
    
5) Take a number as input and print the incerement decrement pattern
    INPUT: 4
    OUTPUT: "0 1 2 3 3 2 1 0"
    
    INPUT: 5
    OUTPUT: "0 1 2 3 4 4 3 2 1 0"
    
6) Check if the string is palindrome or not.
INPUT: "madam"
OUTPUT: true

INPUT: "something"
OUTPUT: false

7) Generate Fabonacci series.
INPUT: 8
OUTPUT: 0 1 1 2 3 5 8 13

Do 2, 3, 4, 5, 6 and 7 recursively
     * @param args
     */
    public static void main(String[] args) {
        // TASK OF FACTORIAL
        int num=5;
        factorial(num);
        System.out.println(factorial(num));
        
        // TASK OF REVERSE STRING 
        String aString= "kill";
        int i=0;
        System.out.print(reverString(aString,i));
        // to make new line between the outputs
        
        System.out.println();
        reverNum(i);
        
        // TASK OF PLAINDROM
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputString= sc.next();
        int firstIndex=0;
        int lastIndex = inputString.length()-1;
        System.out.println(checkpliandrom(inputString, firstIndex, lastIndex ));
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
    
   public static boolean checkpliandrom( String inputString,int firstIndex,int lastIndex) {
       
       if (lastIndex<firstIndex) {
           return false;
       }
       firstIndex++;
       lastIndex--;
       if (inputString.charAt(firstIndex)== inputString.charAt(lastIndex)) 
       {
       
        checkpliandrom(inputString, firstIndex, lastIndex );
       
    return true;
   }
   else
   {
     return false;
   }
}
}
      