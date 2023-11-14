package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		
		
		for (int contador = 0; contador < 5; contador ++) {
			System.out.println("Digite uma cor: ");
			cores.add(leia.next());
		}
			
		
		System.out.println("Listar cores: ");
		
		System.out.println(cores);
		
		
		System.out.println("Ordenar cores: ");
		cores.sort(null);
		
		System.out.println(cores);
		
		
		}	

	}


