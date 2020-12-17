package date.javaCalendar;

import java.util.Calendar;

public class Exercicio {
    
    public static int daysOfPayment(Calendar dataVencimento) {
    
        int days = 10;
        
        // Prazo de 10 dia para pagamento sem juros
        dataVencimento.add(Calendar.DATE, 10);
        
        // Armazena a semana
        int week = dataVencimento.get(Calendar.DAY_OF_WEEK);
        
        System.out.println("O dia da semana é: " + week);
        
        if (week == 1) {
            dataVencimento.add(Calendar.DATE, 1);
            days += 1;
        }
        
        if (week == 7) {
            dataVencimento.add(Calendar.DATE, 2);
            days += 2;
        }
        
        return days;
    }
    
    public static void main(String[] args) {
        
        Calendar dataVencimento = Calendar.getInstance();
        
        System.out.println("O cliente tem " + daysOfPayment(dataVencimento) + " para pagar a fatura sem juros.");
        
    }
}
