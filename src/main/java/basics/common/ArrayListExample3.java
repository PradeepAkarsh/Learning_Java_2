package basics.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample3 {
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

        Collections.sort(list); //// To sort the List.

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
