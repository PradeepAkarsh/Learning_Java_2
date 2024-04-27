package basics.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashsetToArrayList {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Zebra");
        animals.add("Alpha");
        animals.add("Tiger");
        animals.add("Tiger");
        animals.add("Deer");
        animals.add("Deer");

        //Converting the Array List in to HashSet to remove the Duplicates

        HashSet<String> set = new HashSet<>(animals); //Converting List to HashSet to remove Duplicates

        ArrayList<String> al = new ArrayList<>(set); //Converting HashSet to ArrayList to Sort the list.

        Collections.sort(al); // Only we can remove Duplicates from Array List not from HashSet.

        for (String s:al){
            System.out.println(s);
        }
    }
}
