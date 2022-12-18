


/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class LargestNum {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int numbers[]  = new int []{50,12,8,10,1001,6,87,24};
        // return an integer value 
        int a = getLarge(numbers); 
        System.out.println(" Largest number =  "+ a);
        System.out.println("--------------------------");
        // return an array 
        int num []= getFirSec(numbers); 
        System.out.println(" First large num is = " + num[1]+ ", "+ " Second large num is = "+ num[0]+ " and "+ "Third largest num is = "+ num[2]);
    }



    public static int getLarge(int [] numbers) {
        int largestnumber = numbers[0];
        for (int i=1; i < numbers.length ; i++) 
        {
            if (numbers[i]>largestnumber) 
            {
                largestnumber= numbers[i];       

            }
        }
        return largestnumber;

    }
    public static int[] getFirSec (int [] numbers) {
        int largestnumber = numbers[0];
        int secondLast=numbers[0];
        int thirdLast=numbers[0];

        for (int index1=1; index1 < numbers.length ; index1++) 
        {
            if (numbers[index1]>largestnumber) 
                largestnumber= numbers[index1];
            
        }

        for (int index2=0; index2 < numbers.length ; index2++) 
        {

            if (numbers[index2]>secondLast && numbers[index2]!=largestnumber) 

                secondLast = numbers[index2];

        }
        for (int index3=0; index3<numbers.length;index3++) 
        {
            if (numbers[index3]>thirdLast && numbers[index3]!=largestnumber && numbers[index3]!=secondLast) 

                thirdLast = numbers[index3];

        }
        int num [] = new int [3];
        num[0]=secondLast;
        num[1]=largestnumber;
        num[2]=thirdLast;
        return num;
    }
}


