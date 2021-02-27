import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Input first number: ");
        int firstInt = scan.nextInt();
        System.out.printf("Input second number: ");
        int secondInt = scan.nextInt();

        System.out.printf("Sum: %d\n", firstInt + secondInt);
        System.out.printf("Difference: %d\n", firstInt - secondInt);
        System.out.printf("Product: %d\n", firstInt * secondInt);
        System.out.printf("Average: %.2f\n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Quotient: %.2f\n", (firstInt / (double) secondInt));
    }
}
