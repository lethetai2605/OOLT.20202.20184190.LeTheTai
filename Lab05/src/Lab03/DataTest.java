package Lab03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataTest {
    public static Integer[] convertDateStr(String date) {
        String[] word = date.split("/");
        Integer[] a = new Integer[word.length];
        for (int i = 0; i < word.length; i++) {
            a[i] = Integer.parseInt(word[i]);
        }
        return a;
    }

    public static int checkDay(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    return 29;
                } else return 28;

            default:
                return 30;
        }
    }

    public static boolean checkYear(String year) {
        if (year.matches("^[0-9]{4}$")) {
            return true;
        }
        return false;
    }

    public static void accept() {
        System.out.print("Input date(dd/mm/yyyy): ");
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        String[] word = date.split("/");
        Integer[] a = convertDateStr(date);
        if (checkYear(word[2]) && (1 <= a[1] && a[1] <= 12) && (1 <= a[0] && a[0] <= checkDay(a[1], a[2]))) {
            MyDate myDate = new MyDate(a[0], a[1], a[2]);
            myDate.print();
        } else System.out.println("Invalid date!");

    }

    public static void main(String[] args) {
        // Quy ước dd/mm/yyyy
        MyDate now = new MyDate();
        now.print();

        MyDate strParameter = new MyDate("26/05/2000");
        strParameter.print();
        accept();

    }
}