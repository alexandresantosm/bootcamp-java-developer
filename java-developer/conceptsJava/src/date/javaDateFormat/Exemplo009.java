package date.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo009 {
    public static void main(String[] args) {
        
        Date now = new Date();
        
        String dateToStr = DateFormat.getInstance().format(now);
        
        System.out.println(dateToStr);
        
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);
        
        System.out.println(dateToStr);
        
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(now);
        
        System.out.println(dateToStr);
    }
}
