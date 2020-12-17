package date.javaDate;

import java.util.Date;

public class Exemplo003 {
    public static void main(String[] args) {
        
        Date dateOnPast = new Date(1513124807691L);
        
        Date dateOnFuture = new Date(1613124807691L);
        
        // comparando se dateOnPast é posterior a dateOnFuture
        boolean isAfter = dateOnPast.after(dateOnFuture);
        
        System.out.println(isAfter);
        
        // Comparando se dateOnPast é anterior a dateOnFuture
        boolean isBefore = dateOnPast.before(dateOnFuture);
        
        System.out.println(isBefore);
    }
}
