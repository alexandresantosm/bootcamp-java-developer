package date.javaLocalDate;

import java.time.LocalTime;

public class Exemplo014 {
    public static void main(String[] args) {
        
        LocalTime now = LocalTime.now();
        
        System.out.println(now);
        
        LocalTime plusOneHour = now.plusHours(1);
        
        System.out.println(plusOneHour);
    }
}
