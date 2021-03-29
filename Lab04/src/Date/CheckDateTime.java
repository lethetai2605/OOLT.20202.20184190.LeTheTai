package Date;

public class CheckDateTime {
    public static int dayOfMonth(int month, int year) {
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
    public static boolean checkDay(int day,int month,String year)
    {
        int y = Integer.parseInt(year);
        if(1<=day && day<= dayOfMonth(month,y))
        {
            return true;
        }
        return false;
    }
    public static boolean checkMonth(int month)
    {
        if(1<= month && month <= 12)
        {
            return true;
        }
        return false;
    }
    public static boolean checkYear(String year) {
        if (year.matches("^[0-9]{4}$")) {
            return true;
        }
        return false;
    }

    public static boolean accept(int day,int month,String year)
    {

        if(checkYear(year) && checkMonth(month) && checkDay(day,month,year))
        {
            return true;
        }
        return false;
    }
}
