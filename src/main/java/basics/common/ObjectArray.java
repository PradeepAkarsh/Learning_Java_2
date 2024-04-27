package basics.common;

import java.util.Arrays;
import java.util.Objects;

public class ObjectArray {
    public static void main(String[] args) {
        Object obj[] = {8, 239487, "RAj", 213, "Pradeep", 36432, 124532, false, true};


        for (Object object : obj             ) {
            System.out.println(object);
        }
    }
}
