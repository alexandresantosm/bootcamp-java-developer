package date.javaLocalDate;

import java.time.LocalDateTime;

public class Exemplo015 {
    public static void main(String[] args) {
        
        LocalDateTime now = LocalDateTime.now();
        
        System.out.println(now);
        
        LocalDateTime future = now.plusDays(2).plusHours(1).plusSeconds(12);
        
        System.out.println(future);
    }
    
}
