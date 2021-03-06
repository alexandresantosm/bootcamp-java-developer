package javaCollections.javaQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        
        Queue<String> filaBanco = new LinkedList<>();
        
        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Andreson");
        
        System.out.println(filaBanco);
        
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        
        System.out.println(filaBanco);
        
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        
        System.out.println(filaBanco);
        
        // filaBanco.clear();
        
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        
        System.out.println(filaBanco);
        
        for (String cliente : filaBanco) {
            System.out.println("--> " + cliente);
        }
        
        Iterator iterator = filaBanco.iterator();
        
        while (iterator.hasNext()) {
            System.out.println("-----> " + iterator.next());
        }
        
        System.out.println(filaBanco.size());
        
        System.out.println(filaBanco.isEmpty());
    }
    
}
