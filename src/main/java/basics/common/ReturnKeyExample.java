package basics.common;

public class ReturnKeyExample {
    public  String addition( String a,String c){
        String value = (a + c);
       return value;
    }

    public static void main(String[] args) {
        ReturnKeyExample returKey = new ReturnKeyExample();
        String alp = returKey.addition("ab","cd");
        System.out.println(alp);
    }
}
