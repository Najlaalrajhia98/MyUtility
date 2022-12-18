import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-7 
 *
 */
public class ArrayOfNumRepeated {

    /**
     * A class uses Hashmap to find how many times the integer elements occured inside the array 
     */
            public static void main(String[] args) {

                 // array elements will act as a keys
                // the value of hashmap is the num of repetation 
                
                int arr[]= {1,1,2,6,5,3,2,6,7,1,3,2,9,9}; 
                HashMap<Integer,Integer> numoccurance= new HashMap<>(); 
                
                for (int i=0;i<arr.length;i++) 
                {   // in the begining the map will not contain anaything if the value is not contained 
                    //then put it with number of occurance equal to 1 initially 
                    if (!numoccurance.containsKey(arr[i])) 
                    {
                        numoccurance.put(arr[i], 1);


                    } 
                    else 
                    {
                        numoccurance.put(arr[i], numoccurance.get(arr[i])+1);
                       
                    }

                } 
                System.out.println(" EACH NUMBER  =   TIMES OF OCCURANCE" );
                System.out.println("--------------------------------" );
                System.out.print(numoccurance);





    }

}
