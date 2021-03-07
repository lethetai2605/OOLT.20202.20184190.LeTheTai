import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CalculateArray {
    public static int sumArr(int[] X) {
        int sum = 0;
        for (int i = 0; i < X.length; i++) {
            sum = sum + X[i];
        }
        return sum;
    }

    public static void sortArr(int[] X) {
        Arrays.sort(X);
    }

    public static float avgArr(int[] X) {
        float avg = 0;
        if (sumArr(X) ==0) return 0;
        avg = sumArr(X) / (float) (X.length);
        return avg;
    }

    public static boolean checkElement(String s) {
        if (s.matches("^-?\\d+$") || s.equals("$")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int A[] = new int[1000];
        int size;
        String s;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            A[i] = random.nextInt(1000);
        }
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("A[%d] = %d ",i,A[i]);
//        }
        do {
            System.out.printf("Size of Array(<1000): ");
            size = scan.nextInt();
        } while (size >= 1000 || size < 0);

        scan.nextLine();
        int B[] = new int[size];
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            do {
                System.out.printf("a[%d]: ", i);
                s = scan.nextLine();
            }
            while (!checkElement(s));
            if (s.equals("$")) {
                B[i] = A[i];
            } else B[i] = Integer.parseInt(s);
        }

//        for (int i = 0; i < size; i++) {
//            System.out.printf("B[%d] = %d",i,B[i]);
//        }
        sortArr(B);
        System.out.printf("Sum: %d\n", sumArr(B));
        System.out.printf("Average: %.2f\n", avgArr(B));
        System.out.printf("Modified B[]: %s\n", Arrays.toString(B));
    }
}
