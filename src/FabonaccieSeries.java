/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class FabonaccieSeries {

    /** 7) Generate Fabonacci series.
    // INPUT: 8
    // OUTPUT: 0 1 1 2 3 5 8 13

    /*the idea is after printing the first element, 
            //the first and the second value will be 0 and 1, 
            //then the next number will be 1 after addition
            //then after it will go out of the loop second num will be assigned 
            //to first num and next element assigned to the second element
     * 
     */
    
    

    public static void main (String [] args) {
        int i=1;
        int  firstnum=0;
        int  secondnum=1;
        int nextnum=0;
        System.out.println(fabonacciSeries(firstnum, secondnum, nextnum));
        System.out.println();
        System.out.println(recursiveFabonacci(firstnum, secondnum,8,nextnum));


    }
    public static int fabonacciSeries(int firstnum,int secondnum,int nextnum) {

        for (int i=1; i<8 ;i++) {
            System.out.print(" " +firstnum+ " ");
            nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;

        }
        return firstnum; 
    }
    /*
     * This is a method of the same problome done recursively
     */
    public static int recursiveFabonacci(int firstnum,int secondnum,int i, int nextnum) {

        if (i<=0) {


            return 0;
        }


        System.out.print(" "+ firstnum +" ");
        nextnum=firstnum+secondnum;
        firstnum=secondnum;
        secondnum=nextnum;


        return recursiveFabonacci(firstnum, secondnum,i-1, nextnum);
    }

}