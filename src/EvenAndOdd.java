
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class EvenAndOdd {

    /**Given an arry of integers, return the even and odd numbers
    INPUT:  [2, 3, 7, 6, 9, 4, 5, 7]
    OUTPUT: {'even': [2, 6, 4], 'odd': [7, 3, 9, 5, 7]}

     * @param args
     */
    public static void main(String[] args) {
        
        int [] arr= {2,3,7,6,9,4,5,7};
        ArrayList<Integer> oddArrayList= new ArrayList<>();
        ArrayList<Integer> evenStoreArrayList= new ArrayList<>();
        HashMap<String,ArrayList<Integer>> numbers = new HashMap<>();
        
        System.out.println(oddAndeven(arr,oddArrayList,evenStoreArrayList,numbers));
       
} 
    public static  HashMap<String,ArrayList<Integer>> oddAndeven(int[] arr,ArrayList<Integer> evenStoreArrayList,ArrayList<Integer> oddArrayList, HashMap<String,ArrayList<Integer>> numbers) {
        for (int i=0;i<arr.length  ;i++) {
            if (arr[i]%2!=0) {
                oddArrayList.add(arr[i]);
                numbers.put("odd", oddArrayList);
                
               
            }
        } 
            for(int j=0;j<arr.length;j++) {
                if (arr[j]%2==0) {
                    evenStoreArrayList.add(arr[j]);
                    numbers.put("even", evenStoreArrayList);

                    
                    
                }
            }
            return numbers;
}
}