package aula_04;

import java.util.Scanner;

public class Exercicio1 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		System.out.println(" Digite o primeiro numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt();
		
		if (numero2 > numero1) {
			System.out.println("No intervalo entre " + numero1 + "e o " + numero2 + ":");
			for (int i = numero1; i <= numero2; i ++) {
				
				if (i % 3 == 0 && i % 5 == 0) {
					
					System.out.println(i + " é múltiplo de 3 e 5");
					
				}
				
			}
		} else {
			System.out.println("Intervalo é inválido");
		}

	}

}
