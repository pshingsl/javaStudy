package javareview.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
    public static String today(String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format((Calendar.getInstance().getTime()));
    }

    public static String today(){
        return today("yyyy.MM.dd");
    }
}
