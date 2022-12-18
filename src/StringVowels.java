import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class StringVowels {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your words to find num of vowels  : ");
        String inputSentence= scan.next();
        System.out.println("---------------------------------------- ");
        int count=0;
       int  i=0;
       while (i<inputSentence.length()) {
            char character = inputSentence.charAt(i);

            if (character == 'O' || character == 'A'|| character == 'E' || character== 'U' || character =='I'
                    || character == 'a' || character=='u'|| character == 'e' || character=='o'|| character=='i') {

                count ++;
                
            } i++;
        }
        System.out.println("Number of vowels in your input is = " + count);
    }
}
