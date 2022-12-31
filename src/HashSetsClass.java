import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class HashSetsClass {

    /**
     * 5) Given an array of names, remove the duplicate names. With and Without HashSets
INPUT: ["Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C"]
OUTPUT: ["Mr A", "Mr B", "Mr C", "MR D"]
     */
    public static void main(String[] args) {

        String arrayofNames [] = {"Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C"};
        System.out.println(uniNames(arrayofNames));
        namesUnique(arrayofNames);
        uniNamess(arrayofNames);
    }

    // This method is used to return unique elements using HashSet
    public static HashSet<String> uniNames(String [] arrayofNames){

        HashSet<String> names = new HashSet<String>();
        for (int i=0; i<arrayofNames.length;i++) {
            names.add(arrayofNames[i]);

        }

        return names;
    }

    // This method is used to return unique elements using arrays and arraylist 
    public static void namesUnique(String [] arrayofNames) {


        ArrayList<String > arrayList=new ArrayList<>();
        for (int i=0; i<arrayofNames.length;i++) 
        { 
            boolean NamesRepeating = false;
            for (int j=i+1;j<arrayofNames.length;j++) 
            {
                if (arrayofNames[i]==arrayofNames[j]) 
                {
                    NamesRepeating=true;
                } 
            }
            if (!NamesRepeating) 
            {
                String aStrings[] = {arrayofNames[i]};
                arrayList.add(aStrings[0]);
            }
        }    System.out.println(arrayList);
    }

    // This method is used to return unique elements using hashmap
    public static void uniNamess(String [] arrayofNames) {

        HashMap<String , Integer> uniHashMap = new HashMap<>();
        for (int index=0; index<arrayofNames.length;index++) 
        {
            if (!uniHashMap.containsKey(arrayofNames[index])) 
            {
                uniHashMap.put(arrayofNames[index], null);
            }
        }System.out.println(uniHashMap.keySet());
    }
}

