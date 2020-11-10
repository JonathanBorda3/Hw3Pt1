package borda.sjsu;
import java.lang.*;

public class Sorter {
public static String[]filter(String[] a, Filter f){
   int count = 0;
   for(String n:a){
       if(f.accept(n)) count++;
   }
   String[] longStrings = new String[count];
   int index =0;
   for(String n: a){
if (f.accept(n)) longStrings[index++] = n;
   }
   return longStrings;
}

public static int[] filter(int[] a, Filter f){
    int count = 0;
    for(Integer n:a){
        if(f.accept(n))count++;
    }

    int[] positiveNumbers = new int[count];
    int index = 0;
    for (Integer n : a) {
        if (f.accept(n)) positiveNumbers[index++] = n;
    }
    return positiveNumbers;

}

    public static void main(String[] args) {
    //filling array with strings(animal names)
        String[] stringList = {"Porcupine", "frog", "Bandicoot", "rhinoceros", "dog"};
        int[] numList = {-3,-2,-1,0,1,2,3,4};

        //goes through array and checks if it's greater than or equal to 0.
        int[] positiveNumbers = filter(numList, x -> ((Integer) (x)) >= 0);
        //.length returns num of characters in each string.
        String[] filteredStrings = filter(stringList, x -> ((String) (x)).length() >= 9);

        System.out.println("Showing only positive numbers in list:");
        for (int pos : positiveNumbers) {
            System.out.println(pos);
        }
        System.out.println("\nShowing strings with 9 characters in list:");
        for (String s : filteredStrings) {
            System.out.println(s);
        }
        System.out.println();


    }
}
