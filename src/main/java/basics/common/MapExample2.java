package basics.common;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {

        //List Inside A MapMapExample2

        ArrayList<String> a = new ArrayList<>();
        a.add("Pradeep");
        a.add("Apple");

        ArrayList<String> b = new ArrayList<>();
        b.add("Name");
        b.add("Fruit");

        Map<String, List<String>> map = new HashMap<>();
        map.put("A",a);
        map.put("B",b);

        System.out.println(map.entrySet());

        for (Map.Entry<String,List<String>> map1:map.entrySet()){
            System.out.println(map1);

        }
    }
}
