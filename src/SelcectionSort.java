
import java.util.Arrays;

import javax.print.attribute.Size2DSyntax;



/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class SelcectionSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // first activity to swap elements 
        int arr [] = { 4,3,2,1};
        System.out.println(Arrays.toString(arr));
        int a = arr [0];
        arr[0]=arr[1];
        arr[1]=a;
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------");
        int numbers[]  = new int []{50,12,8,10,1001,6,87,24};
        System.out.println(Arrays.toString(selectionSort(numbers)));


    }
    public static int[] selectionSort(int [] numbers) 
    {
        for (int oi=0; oi<numbers.length; oi++) {
            int largestnumber = 0;
            int   largestnumberindex = 0;
            for (int i=oi; i < numbers.length ; i++) 
            {
                if (numbers[i]>largestnumber) 
                {
                    largestnumber= numbers[i];       
                    largestnumberindex = i;
                    
                    
                }
            }
            
            int a = numbers[oi];
            numbers[oi]=numbers[largestnumberindex];
            numbers[largestnumberindex]=a;
        }
        
     
        
        return numbers;

    }
}