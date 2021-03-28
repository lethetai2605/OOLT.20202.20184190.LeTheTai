package Lab03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateTime.format(dateTimeFormatter);
        Integer[] a = DataTest.convertDateStr(formattedDate);
        this.day = a[0];
        this.month = a[1];
        this.year = a[2];
    }

    public MyDate(String date) {
        Integer[] a = DataTest.convertDateStr(date);
        this.day = a[0];
        this.month = a[1];
        this.year = a[2];
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.printf("%02d/%02d/%04d\n", this.day, this.month, this.year);
    }
}