package com.cheng.learningdemo.AboutDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 获取当前时间的上个月，格式“yyyy-MM”
 * from：https://blog.csdn.net/zzq900503/article/details/76524467
 */
public class GetLastMonth {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        int lastMonthMaxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), lastMonthMaxDay);
        //按格式输出
        String lastMonth = sdf.format(calendar.getTime()); //上月最后一天
        System.out.println(lastMonth);

        String lastMonth2 = GetLastMonth.getLastMonth();
        System.out.println(lastMonth2);

    }

    /**
     * 获取当前时间上个月时间2019-01
     * @return
     */
    public static String getLastMonth() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String salaryMonth = new String();
        if (month == 1) {
            salaryMonth = new String((year - 1) + "-" + 12);
        } else if (month < 11 && month > 1) {
            salaryMonth = new String(year + "-0" + (month - 1));
        } else {
            salaryMonth = new String(year + "-" + (month - 1));
        }
        return salaryMonth;
    }
}
