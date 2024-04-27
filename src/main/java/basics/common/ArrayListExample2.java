package basics.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Deer");

        ArrayList<String> list = new ArrayList<>();
        list.add("Pradeep");
        list.add("Akarsh");
        list.add("Vinay");
        list.addAll(animals);

        Collections.sort(list); // To sort the List.

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
