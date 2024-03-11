package operators;

public class MultipleSubMethod {
    public static void main(String[] args) {

        MultipleSubMethod multipleSubMethod = new MultipleSubMethod();
        multipleSubMethod.additionNumber(30,50);
        multipleSubMethod.subtractionNumber(50,20);
        multipleSubMethod.multiplicationNumber(10,5);
        multipleSubMethod.divisionNumber(25,5);
        multipleSubMethod.moduloNumber(38,7);

    }
    public void additionNumber(int x, int y){
        int sum = x + y;
        System.out.println("Addition of two number : "+ sum);
    }
    public void subtractionNumber(int x, int y){
        int sum = x - y;
        System.out.println("Subtraction of two number : "+ sum);
    }

    public void multiplicationNumber(int x, int y){
        int sum = x * y;
        System.out.println("Multiplication of two number : "+ sum);
    }

    public void divisionNumber(int x, int y){
        int sum = x / y;
        System.out.println("Division of two number : "+ sum);
    }

    public void moduloNumber(int x, int y){
        int sum = x % y;
        System.out.println("Modulus of two number : "+ sum);
    }


}
