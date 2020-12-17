package date.javaCalendar;

import java.util.Calendar;

public class Exemplo007 {
    public static void main(String[] args) {
        
        Calendar now = Calendar.getInstance();
        
        System.out.println("A data corrente é: " + now.getTime());
        
        now.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + now.getTime());
        
        now.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + now.getTime());
        
        now.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + now.getTime());
    }
}
