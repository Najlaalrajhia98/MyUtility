


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
        int firstLarge = numbers[0];
        int secondLarge=numbers[0];
        int thirdLarge=numbers[0];

        for (int indexx=1; indexx < numbers.length ; indexx++) 
        {
            if (numbers[indexx]>firstLarge) 
                firstLarge= numbers[indexx];
            
        }

        for (int indeex=0; indeex < numbers.length ; indeex++) 
        {

            if (numbers[indeex]>secondLarge && numbers[indeex]!=firstLarge) 

                secondLarge = numbers[indeex];

        }
        for (int inddex=0; inddex<numbers.length;inddex++) 
        {
            if (numbers[inddex]>thirdLarge && numbers[inddex]!=firstLarge && numbers[inddex]!=secondLarge) 

                thirdLarge = numbers[inddex];

        }
        int num [] = new int [3];
        num[0]=secondLarge;
        num[1]=firstLarge;
        num[2]=thirdLarge;
        return num;
    }
}


