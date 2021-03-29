package Date;


public class DataTest {
    public static void main(String[] args) {
        // year : yyyy
        MyDate myDate = new MyDate("26","05","2000");
        if(myDate.getDay() != 0)
        {
            NumberToWords.solution(myDate.getDay(),myDate.getMonth(), myDate.getYear());
            myDate.print();
        }
        else
        {
            System.out.println("Invalid date!");
        }
        MyDate myDate1 = new MyDate("29","3","2020");
        MyDate myDate2 = new MyDate("29","3","2020");
        if(myDate1.getDay()!= 0 && myDate2.getDay()!=0)
        {
            if(DateUtils.compareDate(myDate1,myDate2)>0)
            {
                System.out.println("d1 xay ra sau d2");
            }
            else if(DateUtils.compareDate(myDate1,myDate2)<0){
                System.out.println("d1 xay ra truoc d2");
            }
            else {
                System.out.println("Bang nhau");
            }
        }
        MyDate [] myDateArr = new MyDate[3];
        for (int i = 0; i < myDateArr.length; i++) {
            myDateArr[i] = new MyDate();
            myDateArr[i].setDay(26-i);
            myDateArr[i].setMonth(12);
            myDateArr[i].setYear(2020);
        }
        // Sap xep tang dan
        DateUtils.SortDate(myDateArr);
        DateUtils.printArr(myDateArr);
    }
}
