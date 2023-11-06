package time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;

public class DateOperation {
    //реализовать метод getAge, принимающий дату рождения в виде стринга, и возвращающий возраст.
    public static int getAge(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(birthDate, formatter);
        int age = (int) ChronoUnit.YEARS.between(parsedDate,LocalDate.now());
        return age;
    }

    public static String[] sortStringDates(String[] dates) {
        //реализовать метод sortStringDates, принимающий массив дат в виде массива стрингов, и возвращающий отсортированный массив стрингов-дат.
        return null;
    }


}