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
    public static void reverseWords(int i) {
        String arr [] = {"Reverse","me","if","you","can"};

        for (i=4; i>=0;i--) {
            System.out.print(" "+arr[i]);
        }


    }
    public static void reverseWord() {
        
        String input="Reverse, me, if, you, can";
        String result[] = input.split(",", 5);
        
        for (int i=0; i<result.length;i++) {
            System.out.print(result[i]);
        }

    } 
}

