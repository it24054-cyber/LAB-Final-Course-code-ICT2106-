import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: Enter integers only");
        }
        finally {
            System.out.println("Program Execution Completed");
        }
    }
}
