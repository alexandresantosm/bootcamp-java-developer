package javaCollections.javaVector;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        
        List<String> esportes = new Vector<>();
        
        // Adiciona 4 esportes
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");
        
        System.out.println("Visualizando o vetor: " +esportes);
        
        // Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");
        System.out.println("Alteração no vetor: " +esportes);
        
        // Remove o esporte da posição 2 do vetor
        esportes.remove(2);
        System.out.println("Remoção no vetor: " +esportes);
        
        // Remove o esporte Handebol do vetor
        esportes.remove("Handebol");
        System.out.println("Remoção no vetor: " +esportes);
        
        // Retorna o primeiro item do vetor
        System.out.println("Primeiro item do vetor: " + esportes.get(0));
        
        // Navega nos esportes
        for (String esporte : esportes) {
            System.out.println("---> " + esporte);
        }
    }
    
}
