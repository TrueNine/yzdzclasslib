package cn.yzdz.calculate;

import cn.yzdz.random.RandomNumber;

import java.util.Date;

/**
 * 计算时间差
 * 给一个时间区间
 * 同时计算闰年
 *
 * @author 彭继工
 * @date 2020-03-11:19:27
 */
public class Time {

    /** 一些时间常量 */
    static final long millisecond = 1;
    static final long second = millisecond * 1000;
    static final long minute = second * 60;
    static final long hour = minute * 60;
    static final long day = hour * 24;
    static final long year = day * 365;
    static final long gregorianIndex = 1970;

    public static long calculateLeapyear(long startNumber) {
        long tempTime = (startNumber - gregorianIndex) * year;
        // 计算闰年
        long leapDay = (startNumber - gregorianIndex) / 4 * day;

        // 计算时差

        long jetlagutc = hour * 8;

        return (tempTime + leapDay) - jetlagutc;
    }
}
