import java.security.PublicKey;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class UniqueAlph {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // using hashMap
     char  arr [] = { 'c' , 'a' , 'c' , 't' , 'a' , 'r' , 'a' , 't' , 'z' };
     
    HashMap<Character, Integer> a =hashMap(arr);
     System.out.print(a.keySet());
    }
    
    
   public static  HashMap<Character, Integer> hashMap (char [] arr){
       
       HashMap<Character,Integer> num= new HashMap<>();
   
       for (int i=0;i<arr.length;i++) 
       {   
           
               num.put(arr[i], null);
           

          
      }
    return num; 
      
  }

    }
    