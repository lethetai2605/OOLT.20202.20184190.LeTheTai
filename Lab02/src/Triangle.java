import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Input n: ");
            n = scan.nextInt();
        } while (n <=0);
        for (int i = 1; i <= n; i++) {
            for (int j = n - i ; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
