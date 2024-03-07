package com.xinyu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date(calendar.getTimeInMillis()) ;
        Date now = calendar.getTime();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Date1: "+sf.format(now));
        System.out.println("Date2: "+sf.format(date));
    }
}
