/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class ReverseString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String aString= "kill";
        reverString(aString);
            
        }

    

    public static String reverString(String aString) {
    for (int i=aString.length()-1;i>=0;i--) {
        System.out.print(aString.charAt(i));
}
    return aString;
    }
}
