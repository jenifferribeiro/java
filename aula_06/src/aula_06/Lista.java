package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>(); // Criando coleção
		/*Double numero;
		
		System.out.println("Digite uma nota: ");
		numero = leia.nextDouble();*/
		
	
		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);
		
		for(var nota : notas)
			System.out.println(nota);
			
		System.out.println(notas);
		
		System.out.println(" Posição do elemento 7:" + notas.indexOf(7.0));
		
		System.out.println(" Existe o elemento 7 ? " + notas.contains(7.0));
		
		System.out.println(" Elemento na posição 0: " + notas.get(0));
		
		notas.remove(3);
		
		System.out.println(notas);
		
		notas.forEach(System.out::println); // :: joga a informação no println e percorra toda estrutura
		
		
		notas.clear(); // apaga todos os elementos da lista
		
		System.out.println("A lista esta vazia? " + notas.isEmpty());

	}

}
