package basics.common;

import java.util.*;

public class HashTable_Example {
    public static void main(String[] args) {

    HashMap<String,String> map = new HashMap<>(); // In HashMap Null Value is Accepted
        map.put(null,null);
        map.put(null,"value");

        System.out.println(map.entrySet());
        for (Map.Entry<String,String> map1 : map.entrySet());

        Hashtable<String,String> hm = new Hashtable<>(); // In Hashtable Null Value is not Acceptable
        hm.put(null,null);
        hm.put(null,"value");


    }



}
