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

6) Given the names of people working in 2 different resturants. Figure out which
   employees work for both of the resturatns. With and Without HashSets
INPUT 1: ["Mr A", "Mr B", "Mr C", "Mr Y", "Mr E"]
INPUT 2: ["Mr X", "Mr Z", "Mr B", "Mr A", "Mr Y", "Mr S", "Mr T"]

OUTPUT: ["Mr A", "Mr B", "MR Y"]
     */
    public static void main(String[] args) {

        String arrayofNames [] = {"Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C"};
        String [] names= {"Mr A", "Mr B", "Mr C", "Mr Y", "Mr E"};
        String [] names2= {"Mr X", "Mr Z", "Mr B", "Mr A", "Mr Y", "Mr S", "Mr T"};
        System.out.println(uniNames(arrayofNames));
        namesUnique(arrayofNames);
        uniNamess(arrayofNames);
        findMatch (names,names2);
        System.out.println(hashsetUnique(names,names2));
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
    // This method is used to get common uni elements using arraylsit and if statments
    public static void findMatch (String [] names,String [] names2) {

        ArrayList<String> storeMatch=new ArrayList<>();

        for (int i=0;i<names.length;i++) {
            for (int j=0;j<names2.length;j++) {
                if (names[i]==names2[j]) {
                    String store[] = {names[i]};
                    storeMatch.add(store[0]);
                }
            }
        }
        System.out.println(storeMatch);
    }
    // This method is used to get the common uni elements using hashSets
    public static HashSet<String> hashsetUnique(String [] names,String [] names2) {

        HashSet<String> set1= new HashSet<>();
        HashSet<String>  set2= new HashSet<>();
        for (String name: names) {
            set1.add(name);
        }
        for (String name2: names2) {
            set2.add(name2);
        }
        set1.retainAll(set2);

        return set1;
    } 
}
