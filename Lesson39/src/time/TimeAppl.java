package time;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class TimeAppl {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate gagarin = LocalDate.of(1961,4,12);
        System.out.println(gagarin);
        System.out.println(gagarin.getDayOfWeek());
        System.out.println(gagarin.getDayOfYear());
        System.out.println(localDate.isBefore(gagarin));
        System.out.println(localDate.isAfter(gagarin));
        System.out.println(gagarin.isAfter(gagarin));
        System.out.println(localDate.compareTo(gagarin));
        System.out.println(gagarin.compareTo(gagarin));
        System.out.println(gagarin.compareTo(localDate));
        LocalDate newDate = localDate.plusDays(10);
        System.out.println(newDate);
        newDate = localDate.plusWeeks(7);
        System.out.println(newDate);
        newDate = localDate.minusMonths(3);
        System.out.println(newDate);
        newDate = localDate.plus(14, ChronoUnit.DECADES);
        System.out.println(newDate);
        LocalTime newTime = localTime.plus(10, ChronoUnit.HALF_DAYS);
        System.out.println(newDate);
        long period = ChronoUnit.WEEKS.between(gagarin, localDate);
        System.out.println(period);
        System.out.println();
        DateTimeFormatter df = DateTimeFormatter.BASIC_ISO_DATE;
        String date = gagarin.format(df);
        System.out.println(date);
        df = DateTimeFormatter.ISO_LOCAL_DATE;
        date = localDate.format(df);
        System.out.println(date);
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = gagarin.format(df);
        System.out.println(date);
        System.out.println();
        df = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.FRANCE);
        date = gagarin.format(df);
        System.out.println(date);
        df = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.forLanguageTag("uk"));
        date = gagarin.format(df);
        System.out.println(date);
        date = "31/10/2023";
        df = DateTimeFormatter.ofPattern("dd/M/yyyy");
        newDate = LocalDate.parse(date, df);
        System.out.println(newDate.format(df));
    }
}
