package cc.mrbird.common.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

    private DateUtil(){

    }

    private static String getDateFormat(Date date, String dateFormatType) {
        SimpleDateFormat simformat = new SimpleDateFormat(dateFormatType);
        return simformat.format(date);
    }

    public static String formatCSTTime(String date, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date d = sdf.parse(date);
        return DateUtil.getDateFormat(d, format);
    }
    
    public static String getCurrentDateTimeStr(String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        return sdf.format(new Date());
    }

    public static final String getDateString(Date aDate, String aPattern) {
        SimpleDateFormat df = null;
        String returnValue = "";

        if (aDate == null) {
        } else {
            df = new SimpleDateFormat(aPattern);
            returnValue = df.format(aDate);
        }

        return (returnValue);
    }

    public static String getCurrentDateTimeStr(){
        return getCurrentDateTimeStr("yyyy-MM-dd HH:mm:ss");
    }
}
