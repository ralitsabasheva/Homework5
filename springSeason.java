package homework;

import java.time.MonthDay;

public class springSeason {
    public static void main(String[] args) {
        MonthDay currentMonthDay = MonthDay.now();
        MonthDay date1 = MonthDay.of(3, 20);
        MonthDay data2 = MonthDay.of(6, 20);
        if ((currentMonthDay.isAfter(date1) || currentMonthDay.equals(date1)) && (currentMonthDay.isBefore(data2) || currentMonthDay.equals(data2))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
