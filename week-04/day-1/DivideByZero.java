public class DivideByZero {
    public static void main(String[] args) {
        divide(2);
        divide(0);

    }

    public static void divide(int n) {
        try {
            System.out.println(10 / n);
        }
        catch (ArithmeticException e){
            System.err.print("fail "+e);
        }

    }
}