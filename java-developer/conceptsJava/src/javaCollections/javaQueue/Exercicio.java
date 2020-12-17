package javaCollections.javaQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
    public static void main(String[] args) {
        
        Queue<String> nomes = new LinkedList<>();
        
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        
        for (String nome : nomes) {
            System.out.println("-> " + nome);
        }
        
        String primeiroNomeNaFila = nomes.peek();
        System.out.println("Primeiro elemento da fila: " + primeiroNomeNaFila);
        
        System.out.println("Fila: " + nomes);
        
        String primeiroNomeNaFilaComRemocao = nomes.poll();
        System.out.println("Primeiro elemento da fila e sua remoção: " + primeiroNomeNaFilaComRemocao);
        
        System.out.println("Fila: " + nomes);
        
        nomes.add("Daniel");
        System.out.println("Fila: " + nomes);
        
        int posicaoDaniel = 0;
        
        for (int i=0; i<nomes.size(); i++) {
            if (nomes.peek() != "Daniel") {
                posicaoDaniel = i;
            }
        }
        
        System.out.println("Posição de Daniel na fila: " + posicaoDaniel);
        
        System.out.println("Tamanho da fila: " + nomes.size());
        
        System.out.println("A fila está vazia? " + nomes.isEmpty());
        
        boolean carlosEstaNaFila = nomes.contains("Carlos");
        
        System.out.println("Carlos está na fila? " + carlosEstaNaFila);
        
        nomes.poll();
        System.out.println("Fila: " + nomes);
    }
        
}
