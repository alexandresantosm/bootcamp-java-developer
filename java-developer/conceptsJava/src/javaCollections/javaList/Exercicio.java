package javaCollections.javaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        
        for (String nome : nomes) {
            System.out.println("-> " + nome);
        }
        
        int indiceCarlos = nomes.indexOf("Carlos");
        
        nomes.set(indiceCarlos, "Roberto");
        
        System.out.println(nomes);
        
        System.out.println("Nome na posição 1: " + nomes.get(1));
        
        nomes.remove(4);
        System.out.println(nomes);
        
        nomes.remove("João");
        System.out.println(nomes);
        
        System.out.println("Qtd itens: " + nomes.size());
        
        boolean contemJuliano = nomes.contains("Juliano");
        System.out.println("Tem o nome Juliano? " + contemJuliano);
        
        List<String> nomes2 = new ArrayList<>();
        
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        
        System.out.println("Nova lista: " + nomes2);
        
        nomes.addAll(nomes2);
        
        System.out.println(nomes);
        
        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);
        
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia? " + listaEstaVazia);
    }
    
}
