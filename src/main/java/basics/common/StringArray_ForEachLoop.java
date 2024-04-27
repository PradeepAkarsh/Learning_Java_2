package basics.common;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArray_ForEachLoop {
    public static void main(String[] args) {
        String name [] = {"Akarsh","pradeed","vinay","Arun","Raj","vinay"};
       // System.out.println(name[0]);
        Arrays.sort(name);
        for (String names : name) {
        System.out.println(names);
        }
    }
}
