package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Exercicio3 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		for (int contador = 0; contador < 10; contador ++) {
			System.out.println("Digite um número não repetido: ");
			numeros.add(leia.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while(iNumeros.hasNext())
			System.out.println(iNumeros.next());

	
	}

}
