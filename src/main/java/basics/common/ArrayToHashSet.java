package basics.common;

import java.util.*;

public class ArrayToHashSet {

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



        for (String s:set){
            System.out.println(s);
        }
    }
}
