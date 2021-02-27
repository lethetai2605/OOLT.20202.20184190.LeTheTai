import java.util.Scanner;

/**
 * SecondDegree1Var
 */
public class SecondDegree1Var {

    public static void main(String[] args) {
        Double a, b, c, delta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a (a!=0): ");
        a = scan.nextDouble();
        System.out.println("Insert b: ");
        b = scan.nextDouble();
        System.out.println("Insert c: ");
        c = scan.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta == 0) {
            System.out.printf("Result: x1 = x2 = %.2f", -b / (2 * a));
        } else if (delta > 0) {
            System.out.printf("Result: x1 = %.2f x2 = %.2f", (-b + Math.sqrt(delta)) / (2 * a),
                    (-b - Math.sqrt(delta)) / (2 * a));
        } else {
            System.out.println("No solution.");
        }
    }
}