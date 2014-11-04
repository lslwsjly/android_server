package com.cs.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期处理工具.
 *
 * @author 李思良.
 *
 */
public final class DateUtils {

    /**
     * 日期模式一.
     */
    public static final String DATE_FORMATTER_1 = "yyyy-MM-dd HH:mm:ss";
    /**
     * 日期模式二.
     */
    public static final String DATE_FORMATTER_2 = "yyyy-MM-dd";
    /**
     * 日期模式三.
     */
    public static final String DATE_FORMATTER_3 = "HH:mm:ss";
    /**
     * 日期模式四.
     */
    public static final String DATE_FORMATTER_4 = "yyyyMMddHHmmss";

    /**
     * 禁用public构造函数.
     */
    private DateUtils() {

    }

    /**
     * 将Date格式的日期转化为String格式的日期.
     *
     * @param date
     *            Date日期
     * @param format
     *            模式
     * @return String化的日期
     */
    public static String format(final Date date, final String format) {
        String ret = null;
        if (date == null || StringUtils.isEmpty(format)) {
            return ret;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        ret = sdf.format(date);

        return ret;
    }

    /**
     * 将String格式的日期转化为Date格式的日期.
     *
     * @param date
     *            String日期
     * @param format
     *            模式
     * @return Date化的日期
     */
    public static Date format(final String date, final String format) {
        Date ret = null;
        try {
            if (StringUtils.isNotEmpty(date)
                    && StringUtils.isNotEmpty(format)) {
                SimpleDateFormat sdf =
                        new SimpleDateFormat(format);
                ret = sdf.parse(date);
            }
        } catch (ParseException e) {
            System.out.println(e);
            ret = null;
        }
        return ret;
    }

    /**
     * 日期天数加减计算.
     *
     * @param date
     *            被加减日期
     * @param days
     *            天数
     * @return 计算结果
     */
    public static Date addDays(final Date date, final int days) {
        if (date != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, days);
            return cal.getTime();
        }
        return date;
    }

    /**
     * 日期天数加减计算.
     *
     * @param date
     *            被加减日期，格式为：yyyy-MM-dd
     * @param days
     *            天数
     * @return 计算结果
     */
    public static Date addDays(final String date, final int days) {
        Date dt = format(date, DATE_FORMATTER_2);
        return addDays(dt, days);
    }

    /**
     * main.
     *
     * @param args
     *            main args
     */
    public static void main(final String[] args) {
        boolean b = isEqualTime(new Date(), new Date());
        if (b) {
            System.out.print(b);
        }
    }

    /**
     * gery:获得当前日期.
     *
     * @return 当前日期
     */
    public static Date getNowDate() {
        Date dt = new Date();
        return dt;
    }

    /**
     * gery: 传入参数的这个月的第一天的日期.
     *
     * @param dt
     *            传入日期
     * @return 传入参数的这个月的第一天的日期
     */
    public static Date getFirstDayInDate(final Date dt) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(dt);
        ca.set(Calendar.DAY_OF_MONTH, 1);
        ca.set(Calendar.HOUR_OF_DAY, 0);
        ca.set(Calendar.MINUTE, 0);
        ca.set(Calendar.SECOND, 0);
        Date firstDate = ca.getTime();

        return firstDate;
    }

    /**
     * gery：d1 是否在开始和结束时间之间,必须对只精确到年月日，小时忽略.
     *
     * @param d1
     *            日期
     * @param begin
     *            开始时间
     * @param end
     *            结束时间
     * @return 布尔值，是否在开始与结束时间之间
     */
    public static boolean betweenTime(final Date d1, final Date begin,
            final Date end) {
        if (begin == null || end == null) {
            return false;
        }
        // 不要时分秒
        String s = format(d1, DATE_FORMATTER_2);
        Date d2 = format(s, DATE_FORMATTER_2);
        int ret1 = d2.compareTo(begin);
        int ret2 = d2.compareTo(end);
        if (ret1 >= 0 && ret2 <= 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断日期是否相等.
     *
     * @param d1
     *            日期一
     * @param d2
     *            日期二
     * @return 是否相等
     */
    public static boolean isEqualTime(final Date d1, final Date d2) {
        String s1 = format(d1, DATE_FORMATTER_1);
        String s2 = format(d2, DATE_FORMATTER_1);
        return s1.equalsIgnoreCase(s2);
    }

    /**
     * 将String转化为Date.
     *
     * @param dateStr
     *            欲转化字符串
     * @param formatStr
     *            转化模式
     * @return 转化日期
     */
    public static Date stringToDate(
            final String dateStr, final String formatStr) {
        DateFormat dd = new SimpleDateFormat(formatStr);
        Date date = null;
        try {
            date = dd.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
