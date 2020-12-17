package javaExceptions;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo001 {
    
    public static int age(int year) {
        
        int currrentYear = LocalDate.now().getYear();
        return currrentYear - year;
    }
    
    public static void main(String[] args) {
        
        int year = 0;
        Scanner scanner = new Scanner(System.in);        
        
        System.out.println("Digite o ano de nascimento: ");
        
        try {
            year = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Você passou um valor inválido! \nTipo de erro: " + e);
            return;
        }
        
        System.out.println("A soma é: " + age(year));
        
    }
    
}
