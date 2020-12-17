package date.javaLocalDate;

import java.time.LocalDateTime;

public class Exercicio {
    public static void main(String[] args) {
        
        LocalDateTime dateTime = LocalDateTime.of(2010, 5, 15, 10, 0, 0);
        
        System.out.println(dateTime);
        
        LocalDateTime futureDate = dateTime.plusYears(4).plusMonths(6).plusHours(13);
        
        System.out.println(futureDate);
    }
    
}
