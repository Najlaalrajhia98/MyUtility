import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class UsingSplit {

    /**  
     * 
     * 
2) Reverse words contained in a sentence (String)
         INPUT: "Reverse me if you can"
         OUTPUT: "can you if me Reverse"
  3) Implement .split method. split should take a character as input
   and returns an array of strings.
   INPUT: "Reverse me if you can"
   OUTPUT: ["Reverse", "me", "if", "you", "can"]
     * 
     */
    public static void main(String[] args) {
        char delimiter = ',';
        String input="Reverse,me,if,you,can";
        int i=0;
        reverseWords(i);
        System.out.println();
        reverseWord(input);
        System.out.println();
        System.out.println(splitMethod(input,delimiter));

    }
    public static void reverseWords(int i) 
    {
        String arr [] = {"Reverse","me","if","you","can"};


        for (i=4; i>=0;i--) 
        {
            System.out.print(" "+arr[i]);

        }
        System.out.print("\n");
        System.out.print("------------------------------"); 

    }

    public static void reverseWord(String input) {

        Stack<String> myStack = new Stack<>();
        
        String result[] = input.split(",", 5);

        for (int i=0; i<result.length;i++) 
        {
            System.out.print(" "+result[i]);
            myStack.add(result[i]);
        } 

        System.out.println();
        while (!myStack.empty()) {
            System.out.print(" "+myStack.pop());
        }


    } // implementation of the split method without using .slpit()
    public static ArrayList<String> splitMethod(String input,char delimiter) 
    {
        ArrayList<String> element= new ArrayList<>();
        String subString= "";
        
        for (int i=0; i<input.length();i++) 
        {
            if (input.charAt(i)== delimiter) 
            {
                element.add(subString);
                subString=" ";
            } else 
            {
                subString=subString+input.charAt(i);
                
            }
       
        } element.add(subString);
        
        return element;
    }
}