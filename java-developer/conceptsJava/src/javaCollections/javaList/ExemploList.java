package javaCollections.javaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        
        // Criando e instanciando uma lista
        List<String> nomes = new ArrayList<>();
        
        // Adição de elementos a lista
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        
        System.out.println("Lista: " + nomes);
        
        // Alteração de elemento pelo índice
        nomes.set(2, "Larissa");
        
        System.out.println("Alteração na lista:" + nomes);
        
        // Ordenação simples
        Collections.sort(nomes);
        
        System.out.println("Lista ordenada: " + nomes);
        
        nomes.set(2, "Wesley");
        
        System.out.println("Alteração na lista:" + nomes);
        
        // Remoção de elemento da lista
        nomes.remove(4);
        
        System.out.println("Remoção na lista:" + nomes);
        
        nomes.remove("Wesley");
        
        System.out.println("Remoção na lista:" + nomes);
        
        // Retornar elemento dado um índice
        String nome = nomes.get(1);
        
        System.out.println("Retorno do elemento: " + nome);
        
        // Retornar posição de um elemento
        int posicao = nomes.indexOf("Carlos");
        
        System.out.println("Posição do elemento: " + posicao);
        
        // Retornar o tamanho de uma lista
        int tamanho = nomes.size();
        
        System.out.println("Tamanho da lista: " + tamanho);
        
        nomes.remove("Larissa");
        
        System.out.println("Tamanho da lista: " + tamanho);
        
        // Verificar se existe um elemento na lista
        boolean temAnderson = nomes.contains("Anderson");
        
        System.out.println("Tem Aderson? " + temAnderson);
        
        boolean temFrenando = nomes.contains("Frenando");
        
        System.out.println("Tem Frenando? " + temFrenando);
        
        // Verificar se a lista está vazia
        boolean listaEstaVazia = nomes.isEmpty();
        
        System.out.println("A lista está vazia? " + listaEstaVazia);
        
        //Interar sobre uma lista
        for (String nomeDoElemento : nomes) {
            System.out.println("--> " + nomeDoElemento);
        }
        
        Iterator<String> iterator = nomes.iterator();
        
        while (iterator.hasNext()) {
            System.out.println("---->" + iterator.next());            
        }
        
        nomes.clear();
        
        listaEstaVazia = nomes.isEmpty();
        
        System.out.println("A lista está vazia? " + listaEstaVazia);
    }
    
}
