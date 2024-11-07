
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskSheet130 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first Number :");
            int fNumber = scanner.nextInt();
            System.out.print("Enter second Number :");
            int sNumber = scanner.nextInt();

            float total = (float)(fNumber / sNumber);
            System.out.println("Result :" + total);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot Divide by zero");
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }

}


