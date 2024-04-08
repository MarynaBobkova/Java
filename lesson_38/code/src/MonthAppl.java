package ait.enums;

import ait.enums.model.Month;

public class MonthAppl {
    public static void main(String[] args) {
        Month month = Month.APR;
        System.out.println(month);
        System.out.println(month.plustMonth(4));
        System.out.println(Month.OCT.plustMonth(5));
        System.out.println(Month.getName(13));
        System.out.println(Month.JUL.getDays());
    }
}
