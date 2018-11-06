import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)
        // You can use the Scanner class
        // It should work like this:
        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        Scanner sc = new Scanner(System.in);
        String s = new String();
        do {
            System.out.println("Please type in the expression:");
            s = sc.nextLine();
            System.out.println(calculate(s));
        } while (s != "stop");
    }
    private static Integer calculate(String q) {
        Integer t = null;
        String[] u = q.split(" ");
        if (u[0].equals("+")) t = Integer.parseInt(u[1]) + Integer.parseInt(u[2]);
        else if (u[0].equals("-")) t = Integer.parseInt(u[1]) - Integer.parseInt(u[2]);
        else if (u[0].equals("*")) t = Integer.parseInt(u[1]) * Integer.parseInt(u[2]);
        else if (u[0].equals("/")) t = Integer.parseInt(u[1]) / Integer.parseInt(u[2]);
        else if (u[0].equals("%")) t = Integer.parseInt(u[1]) % Integer.parseInt(u[2]);
        if (t == null) System.err.println("Type the format: operator number1 number2");
        return t;
    }
}