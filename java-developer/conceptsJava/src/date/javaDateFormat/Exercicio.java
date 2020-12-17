package date.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio {
    
    public static String formatterDate(Date date) {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        return formatter.format(date);
    }
    
    public static void main(String[] args) {
        
        Date now = new Date();
        
        System.out.println("Hoje é: " + formatterDate(now));
    }
}
