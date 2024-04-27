package basics.common;

public class StringArray_ForLoop_2 {
    public static void main(String[] args) {
        String names [] = new String[5];
        names[0] = "padeep";
        names[1] = "vinay";
        names[2] = "Akarsh";

        for (int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
