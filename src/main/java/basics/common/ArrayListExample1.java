package basics.common;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample1 {
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


        System.out.println(list);
        System.out.println(list.get(4));

        for(String li : list){
            System.out.println(li);
        }


    }
}
