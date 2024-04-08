package task2;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class DataTime {

    private int hour;
    private int minute;

    public DataTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataTime dataTime = (DataTime) o;

        if (hour != dataTime.hour) return false;
        return minute == dataTime.minute;
    }

    @Override
    public int hashCode() {
        int result = hour;
        result = 31 * result + minute;
        return result;
    }

    @Override
    public String toString() {
        // ЧЧ:ММ
        String h = this.hour < 10 ? "0" + this.hour : "" + this.hour; // 09 08
        return h + ":" + this.minute;
    }

//    @Override
//    public String toString() {
//        return "DataTime{" +
//                "hour=" + hour +
//                ", minute=" + minute +
//                '}';
//    }
}
