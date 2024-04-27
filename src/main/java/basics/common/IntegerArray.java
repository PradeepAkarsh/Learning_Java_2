package basics.common;

import java.util.Arrays;

    public class IntegerArray {
    public static void main(String[] args) {
        Integer numbers [] = {8,239487,324,213,324,36432,124532,};

        Arrays.sort(numbers);
        for (int i= 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
