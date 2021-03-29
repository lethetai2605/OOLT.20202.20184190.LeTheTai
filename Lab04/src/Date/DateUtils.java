package Date;

public class DateUtils {
    public static int compareDate(MyDate d1,MyDate d2)
    {
        if(d1.getYear()>=d2.getYear())
        {
            if(d1.getMonth()>=d2.getMonth())
            {
                if(d1.getDay()>d2.getDay())
                {
                    return 1;
                }
                if(d1.getDay()==d2.getDay())
                {
                    return 0;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }
    public static void SortDate(MyDate [] myDates){
        int n = myDates.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-i-1; j++) {
                if(DateUtils.compareDate(myDates[j],myDates[j+1]) == 1)
                {
                    var temp = myDates[j];
                    myDates[j] = myDates[j+1];
                    myDates[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(MyDate[] myDates)
    {
        for (var item: myDates) {
            System.out.printf("%2d/%2d/%4d\n",item.getDay(),item.getMonth(),item.getYear());
        }
    }
}
