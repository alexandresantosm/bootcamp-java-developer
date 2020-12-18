package javaCollections.javaSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		// Adiciona numeros no Set
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);
		
		System.out.println(sequenciaNumerica);
		
		sequenciaNumerica.remove(4);
		
		System.out.println(sequenciaNumerica);
		
		System.out.println("Tamanho do LinkedHashSet: " + sequenciaNumerica.size());
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("--> " + iterator.next());
		}
		
		for (int numero : sequenciaNumerica) {
			System.out.println("----> " + numero);
		}
		
		sequenciaNumerica.clear();
		
		System.out.println("LinkedHashSet está vazio? " + sequenciaNumerica.isEmpty());
	}
}
