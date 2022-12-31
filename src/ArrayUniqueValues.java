import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class ArrayUniqueValues {

    /**
     * @param args
     */
    public static void main(String[] args) {

        char charelements[]= { 'c' , 'a' , 'c' , 't' , 'a' , 'r' , 'a' , 't' , 'z' };
     char [] a  = uniqueChar(charelements);

    }

public static char [] uniqueChar(char[] charelements) {
    for (int i=0;i<charelements.length;i++) 
    {
        Boolean elementsRepeating=false;

        for(int j=i+1;j<charelements.length ;j++) 
        {
            if (charelements[i]==charelements[j])
                elementsRepeating=true;
        }

        if (!elementsRepeating) 
        {
            System.out.println(charelements[i]);

        }
    }
    return charelements;
}
}