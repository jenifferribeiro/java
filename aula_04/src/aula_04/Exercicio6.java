package aula_04;

import java.util.Scanner;

public class Exercicio6 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int numero;
		float somaMultiplo = 0f, total = 0f;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
		
			if (numero % 3 == 0 && numero !=0) {
				somaMultiplo += numero;
				total ++;
				
			}
			
		} while (numero != 0);
		System.out.println("A média de todos os números múltiplos de 3 é: " + (somaMultiplo/total));

	}

}
