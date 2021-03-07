import java.util.Scanner;

public class NumDayOfMonth {
    public static int dayOfMonth(int month, int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                {
                    return 29;
                }
                else return 28;

            default:
                return 30;
        }
    }

    public static int convertMonth(String month) {
        switch (month) {
            case "Jan":
            case "January":
            case "1":
            case "01":
                return 1;
            case "Feb":
            case "February":
            case "2":
            case "02":
                return 2;
            case "Mar":
            case "March":
            case "3":
            case "03":
                return 3;
            case "April":
            case "Apr":
            case "4":
            case "04":
                return 4;
            case "May":
            case "05":
                return 5;
            case "Jun":
            case "June":
            case "6":
            case "06":
                return 6;
            case "Jul":
            case "July":
            case "7":
            case "07":
                return 7;
            case "Aug":
            case "August":
            case "8":
            case "08":
                return 8;
            case "Sep":
            case "September":
            case "9":
            case "09":
                return 9;
            case "Oct":
            case "October":
            case "10":
                return 10;
            case "Nov":
            case "November":
            case "11":
                return 11;
            case "Dec":
            case "December":
            case "12":
                return 12;
            default:
                return 0;
        }
    }

    public static int convertYear(String year) {
        if (year.matches("^[0-9]{4}$")) {
            return Integer.parseInt(year);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month, year;
        int m, y, day;
        do {
            System.out.printf("Input month: ");
            month = scan.nextLine();
            m = convertMonth(month);
        } while (m == 0);
        do {
            System.out.printf("Input year: ");
            year = scan.nextLine();
            y = convertYear(year);
        } while (y == -1);
        day = dayOfMonth(m,y);
        System.out.printf("Day of month %02d/%4d: %d",m,y,day);
    }
}
