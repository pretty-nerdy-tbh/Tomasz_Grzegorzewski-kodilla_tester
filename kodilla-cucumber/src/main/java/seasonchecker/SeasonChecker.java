package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public static String checkIfSummer(MonthDay date) {
        if (isDateInSummer(date)){
            return "Yes! Summer!";
        }
        return "Nope";
    }

    private static boolean isDateInSummer (MonthDay date){
        return date.isAfter(MonthDay.of(6,20))
                && date.isBefore(MonthDay.of(9,24));
    }
}
