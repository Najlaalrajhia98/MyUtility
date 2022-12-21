import java.security.Identity;
import java.util.HashMap;
import java.util.IllegalFormatCodePointException;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class MatchMakingByHash {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int [] num = {6,7,4,7,4,3,6,4,5};
        int target=10;
        HashMap<Integer, Integer> suMap= new HashMap<>();
        for (int i=0;i<num.length;i++) {
            suMap.put(num[i], null);
          int element=target-num[i];
          if(suMap.containsKey(element)) {
              System.out.println(element+","+ num[i] );
          }
            
        
}
    }
}