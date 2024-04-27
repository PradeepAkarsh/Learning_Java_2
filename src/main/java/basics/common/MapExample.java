package basics.common;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        HashMap<String, String > map = new HashMap<>();
        map.put("Name","Pradeep");
        map.put("Location","Jaipur");

       // System.out.println(map.get("Location"));

        for(Map.Entry<String, String> ref :map.entrySet() ){
            System.out.println(ref.getKey());
            System.out.println("********************************");
        }
        for(Map.Entry<String, String> ref :map.entrySet() ){

            System.out.println(ref.getValue());
            System.out.println("********************************");
        }
        for(Map.Entry<String, String> ref :map.entrySet() ){
            System.out.println(ref);
        }
    }
}
