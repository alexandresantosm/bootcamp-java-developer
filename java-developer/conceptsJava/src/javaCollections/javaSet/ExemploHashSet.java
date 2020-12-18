package javaCollections.javaSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
	public static void main(String[] args) {

		Set<Double> notasAlunos = new HashSet<>();
		
		notasAlunos.add(5.8);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);
		
		System.out.println(notasAlunos);
		
		// Remove nota do Set
		notasAlunos.remove(3.8);
		
		System.out.println(notasAlunos);
		
		// Navega em todos os itens
		for (double nota : notasAlunos) {
			System.out.println("--> " + nota);
		}
		
		Iterator<Double> iterator = notasAlunos.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("----> " + iterator.next());
		}
		
		System.out.println("Tamanho do Set: " + notasAlunos.size());
		
		
		notasAlunos.clear();
		
		System.out.println("Set está vazio? " + notasAlunos.isEmpty());
	}
}
