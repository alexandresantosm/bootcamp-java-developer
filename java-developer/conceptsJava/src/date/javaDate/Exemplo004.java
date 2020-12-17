package date.javaDate;

import java.util.Date;

public class Exemplo004 {
    public static void main(String[] args) {
        
        Date dateOnPast = new Date(1513124807691L);
        
        Date dateOnFuture = new Date(1613124807691L);
        
        Date sameDateOnFuture = new Date(1613124807691L);
        
        // comparando se as datas são iguais
        boolean isEquals = dateOnFuture.equals(sameDateOnFuture);
        
        System.out.println(isEquals);
        
        // Comparando uma data com outra
        int compareCase1 = dateOnPast.compareTo(dateOnFuture);
        
        int compareCase2 = dateOnFuture.compareTo(dateOnPast);
        
        int compareCase3 = dateOnFuture.compareTo(sameDateOnFuture);
        
        System.out.println(compareCase1);
        
        System.out.println(compareCase2);
        
        System.out.println(compareCase3);
    }
}
