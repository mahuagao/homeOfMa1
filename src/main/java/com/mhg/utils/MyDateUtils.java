package com.mhg.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateUtils {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");

    public static Date strToDate(String strDate){
        Date parse = null;
        try{
            parse = simpleDateFormat.parse(strDate);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return parse;
    }

    public static String dateToString(Date date){
        String format = simpleDateFormat.format(date);
        return format;
    }

    public static Date strToDate1(String strDate){
        Date parse = null;
        try{
            parse = simpleDateFormat1.parse(strDate);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return parse;
    }

    public static String dateToString1(Date date){
        String format = simpleDateFormat1.format(date);
        return format;
    }

}