package date.javaDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo005 {
    public static void main(String[] args) {
        
        Date initialDate = new Date(1513124807691L);
        
        System.out.println(initialDate);
        
       Instant instant = initialDate.toInstant();
       System.out.println(instant);
    }
}
