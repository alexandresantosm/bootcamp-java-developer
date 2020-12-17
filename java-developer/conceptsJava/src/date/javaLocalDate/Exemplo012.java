package date.javaLocalDate;

import java.time.LocalDate;

public class Exemplo012 {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        
        LocalDate yesterday = today.minusDays(1);

        System.out.println("Hoje é: " + today);
        
        System.out.println("Ontem foi: " + yesterday);
    }
}
