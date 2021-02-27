import java.util.Scanner;

/**
 * FirstDegree2Var
 */
public class FirstDegree2Var {

    public static void main(String[] args) {
        Double a11, a12, b1, a21, a22, b2, D, D1, D2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a11,a12,b1: ");
        a11 = scan.nextDouble();
        a12 = scan.nextDouble();
        b1 = scan.nextDouble();

        System.out.println("Insert a21,a22,b2: ");
        a21 = scan.nextDouble();
        a22 = scan.nextDouble();
        b2 = scan.nextDouble();

        D = a11 * a22 - a21 * a12;
        D1 = b1 * a22 - b2 * a12;
        D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            System.out.printf("Result x1: %.2f x2: %.2f", D1 / D, D2 / D);
        } else if (D == 0 && D1 == 0 && D2 == 0) {
            System.out.println("Infinitely many solutions. ");
        } else {
            System.out.println("No solution.");
        }
    }
}