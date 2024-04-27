package basics.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ListIterator;

public class HashSetExample1 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>(); //Hashset will remove the duplicate
        set.add("Pradeep");
        set.add("Akarsh");
        set.add("Vinay");
        set.add("Vinay");

        System.out.println(set);

        for (String s:set){
            System.out.println(s);
        }
    }
}
