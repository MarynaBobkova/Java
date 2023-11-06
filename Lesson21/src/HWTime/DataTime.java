package HWTime;
/*
Создайте класс DataTime для представления даты и времени, с полями year, month, day, hour и minute.

Переопределите метод toString() для класса DateTime так, чтобы он возвращал строку в формате "ГГГГ-ММ-ДД ЧЧ:ММ".
Создайте несколько объектов DateTime и запишите их в массив, с разными данными
Создайте ещё один объект DateTime, который будет являться целью для поиска.
Напишите код, который ищет первое совпадение объекта DateTime из пункта 3 в массиве объектов из пункта
2. Используйте метод equals() для сравнения объектов.

Выведите на экран результат поиска, показывая найденное совпадение или сообщение о его отсутствии. Обратите внимание на формат вывода.
 */

public class DataTime {
    private int hour;
    private int minute;
    private int day;
    private int month;
    private int year;

    public DataTime(int hour, int minute, int day, int month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataTime dataTime = (DataTime) o;

        if (hour != dataTime.hour) return false;
        if (minute != dataTime.minute) return false;
        if (day != dataTime.day) return false;
        if (month != dataTime.month) return false;
        return year == dataTime.year;
    }

    @Override
    public int hashCode() {
        int result = hour;
        result = 31 * result + minute;
        result = 31 * result + day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }



    @Override
    public String toString() {
        String h = this.hour < 10 ? "0" + this.hour: "" + this.hour;
        String m = this.month < 10 ? "0" + this.month: "" + this.month;
        String d = this.day < 10 ? "0" + this.day: "" + this.day;
        String min = this.minute < 10 ? "0" + this.minute: "" + this.minute;
        return this.year + "-" +m + "-" + d + " " + h + ":" + min;
    }
}
