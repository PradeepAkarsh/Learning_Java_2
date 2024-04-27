package basics.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample4 {
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

        ListIterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("*****************************");

        while (it.hasPrevious()){ //used to reverse the list
            System.out.println(it.previous());  //used to print the list
        }
    }
}
