import java.security.PublicKey;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class MatchMaking {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        
        int num[]= {6,4,7,3,1,6,4};
        int sum=10;
     int [] a  = sumMatch(num,sum);
     
         
    }
           
       
       public static int [] sumMatch (int [] num,int sum) {
           
           
           for (int i = 0; i < num.length; i++) {
               
               for (int j = i+1; j < num.length-1; j++) {
                   
                   if ((num[i] + num[j]) == sum) {
                       System.out.println(num[i]+ ","+ num[j]);
                   
        
           
               }
           
               }

               }
             
        return num;
           
       }
       

    }
    

