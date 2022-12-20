import java.awt.FocusTraversalPolicy;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class BubbleSort {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("--------------------------------");
        int numbers[]  = new int []{1,2,3,4,5};
        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }

    public static int[] bubbleSort (int [] numbers) 
    { 
        int  Size= numbers.length;

        for (int oi=0; oi< Size; oi++) {

            for (int i=0; i < Size-1 ; i++) 
            {
                if (numbers[i]<numbers[i+1]) 
                {
                    int a  = numbers[i];
                    numbers[i]=numbers[i+1];
                    numbers[i+1]=a;



                }
            }
            // to print status every iteration
            for(int Status : numbers) { 
                System.out.print(Status);
            }
        System.out.println();


        
        }


        return numbers;

    }
}

