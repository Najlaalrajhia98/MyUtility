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

        int i=0;
        reverseWords(i);
        System.out.println();
        reverseWord();

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

    public static void reverseWord() {

        Stack<String> myStack = new Stack<>();
        String input=" Reverse, me, if, you, can";
        String result[] = input.split(",", 5);

        for (int i=0; i<result.length;i++) 
        {
            System.out.print(result[i]);
            myStack.add(result[i]);
        } 

        System.out.println();
        while (!myStack.empty()) {
            System.out.print(myStack.pop());
        }


    } public static void splitMethod() {
        ArrayList<String> arrayList =new ArrayList<>();
        String input="Reverse me if you can";
        
        for (int i=0; i<input.length();i++) {
            if (input.charAt(i)==' ') {
                String string1 = String.valueOf(input.charAt(i));
                arrayList.add(string1);
            String aString [] = new String [3];
            aString[0]=aString2;
                arrayList.add(aString[0]);
                System.out.println(arrayList);
                
                
            }
        }
    }
}
            //for (String kString : arrayList) {
               // System.out.print(kString);
       


