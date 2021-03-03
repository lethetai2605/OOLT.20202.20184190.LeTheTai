import java.util.Scanner;

public class FirstDegree1Var {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a: ");
        Double a = scan.nextDouble();
        System.out.println("Insert b: ");
        Double b = scan.nextDouble();
        if (a == 0) {
            System.out.println("Result x:" + (-b));
        } else {
            System.out.println("Result x:" + (-b / a));
        }
    }
}
