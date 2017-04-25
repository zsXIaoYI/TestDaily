package cn.zsza.zother;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 2016/2/18.
 */
public class CalendarDemo2 {
    /**
     * 获取当前时间
     */
    @Test
    public void test1(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(d);
		System.out.println(time);
    }
    @Test
    public void test2(){
        Calendar cal=Calendar.getInstance();
        cal.setTime(new Date());
        int week=cal.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(week);
    }
    @Test
    public void test3(){
        Calendar cal=Calendar.getInstance();
        int minute = cal.get(Calendar.MINUTE);
        System.out.println("..."+minute);
    }

    /**
     * 获取指定年月的最后一天
     */
    @Test
    public void test4(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        // 不加下面2行，就是取当前时间前一个月的第一天及最后一天
        cal.set(Calendar.YEAR,2012);
        cal.set(Calendar.MONTH, 6);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date lastDate = cal.getTime();
        String day = format.format(lastDate);
        System.out.println(day);

    }


}
