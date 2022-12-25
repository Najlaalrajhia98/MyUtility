import java.util.HashMap;
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
    OUTPUT: {'result': 8}
     * @param args
     */
    public static void main(String[] args) {
        
        int power=1;
        HashMap<String, Integer> baseExpo = new HashMap<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println(resultnum(baseExpo,power,scanner));
    } 
    

    public static HashMap<String, Integer> resultnum(HashMap<String, Integer> baseExpo,int power,Scanner scanner) {
        
        
        System.out.println("Enter the base :");
        int  base = scanner.nextInt();
        baseExpo.put("base", base);
        System.out.println("Enter the exponent :");
        int expo =scanner.nextInt();
        baseExpo.put("expononent", expo);
        
       
        for (int i=0; i<expo ; i++) {
            power=power*base;
        }
        baseExpo.put("Result", power);
        
        
        return baseExpo;
        
    }
    
}
