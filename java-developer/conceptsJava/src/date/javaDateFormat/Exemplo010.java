package date.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo010 {
    public static void main(String[] args) {
        
        Date now = new Date();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        String formattedDate = formatter.format(now);
        
        System.out.println(formattedDate);
    }
}
