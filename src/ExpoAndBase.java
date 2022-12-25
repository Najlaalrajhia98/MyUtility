import java.util.Scanner;


/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class ExpoAndBase {

    /**2) Calculate power, given the base and exponent.
    INPUT:  {'base': 2, 'exponent': 3}
    OUTPUT: {'result': 6}
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the base :");
        int base = scanner.nextInt();
        System.out.println("Enter the expo :");
        int expo =scanner.nextInt();
   
        System.out.println("Result = "+  resultNum(expo, base));
        
    } 
    
    public static int resultNum(int expo,int base) {
        int power=1;

        for (int i=0; i<expo ; i++) {
            power=power*base;
        }
        return power;

    } 
}
