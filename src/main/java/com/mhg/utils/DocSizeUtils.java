package com.mhg.utils;

public class DocSizeUtils {

    //文件大小计算
    public static String ctdoc(String dsize){
        String size = new String();
        double ds1;
        Double ds2;
        long ds = Long.parseLong(dsize);
        if (ds<1024) {
            ds2 = (double)ds;
            size = ds2.toString() + "Byte";
        }else{
            ds1 = ds / 1024;
            if (ds1<1024) {
                ds2 = ds1;
                size = ds2.toString() + "KB";
            }else{
                ds1 = ds1/1024;
                ds2 = ds1;
                size = ds2.toString()+"M";
            }
        }

        return size;
    }

}
