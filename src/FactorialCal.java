import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class FactorialCal {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        
        Scanner sc =new Scanner(System.in);
        
        int out=1;
        int a =0;

        System.out.println("Enter the number you want to get its factorial:");
        a = sc.nextInt();

        do {
            if (a<=0) {
                System.out.println("Enter a positive num:");
                a = sc.nextInt(); }  
        } while (a<=0);

        for (int i=a; i<=a && i!=0 ;i--) {
            if (a>0) 
                out=out*i;

        }   

        System.out.println("Factorial = "+ out);

    } 
}





