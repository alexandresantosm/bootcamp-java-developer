package javaCollections.javaSet;

import java.util.HashSet;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		
		System.out.println(numeros);
		
		for (int numero : numeros) {
			System.out.println("-> " + numero);
		}
		
		numeros.remove(3);
		System.out.println(numeros);
		
		numeros.add(23);
		System.out.println(numeros);
		
		System.out.println("Tamanho do Set: " + numeros.size());
		
		System.out.println("Set está vazio? " + numeros.isEmpty());
	}

}
