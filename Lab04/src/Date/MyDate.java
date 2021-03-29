package Date;

import java.time.LocalDate;

public class MyDate {
    private int Day;
    private int Month;
    private int Year;

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
    public MyDate(){

    }

    public MyDate(String day, String month, String year)
    {
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        if(CheckDateTime.accept(d,m,year))
        {
            this.Day = d;
            this.Month = m;
            this.Year = y;

        }
        else
        {
            this.Day = 0;
            this.Month = 0;
            this.Year = 0;
        }
    }
    public void print(){
        System.out.printf(NumberToWords.generateMonth(getMonth()) + " ");
        System.out.print(getDay());
        switch (getDay())
        {
            case 2: case 22:
            System.out.printf("nd");
            break;
            case 1: case 21: case 31:
            System.out.printf("st");
                break;
            case 3: case 23:
            System.out.printf("rd");
            default:
                System.out.printf("th");
                break;
        }
        System.out.print(" " + getYear());
        System.out.println("\n");
    }
}
