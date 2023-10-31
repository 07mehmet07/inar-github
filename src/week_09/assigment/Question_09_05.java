package week_09.assigment;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Question_09_05 {
    public static void main(String[] args) {


        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("Current year " + calendar.get(Calendar.YEAR));
        System.out.println("Current month " + calendar.get(Calendar.MONTH));
        System.out.println("Current day " + calendar.get(Calendar.DAY_OF_MONTH));


        System.out.println("\nAfter set time");
        calendar.setTimeInMillis(1234567898765L);

        System.out.println("Current year " + calendar.get(Calendar.YEAR));
        System.out.println("Current month " + calendar.get(Calendar.MONTH));
        System.out.println("Current day " + calendar.get(Calendar.DAY_OF_MONTH));
    }
}
