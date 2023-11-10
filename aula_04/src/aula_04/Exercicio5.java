package aula_04;

import java.util.Scanner;

public class Exercicio5 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, somaPositivo = 0;

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();

			if (numero > 0) {
				somaPositivo += numero;

			}
		} while (numero != 0);
		System.out.println("A soma dos números positivos é: " + somaPositivo);
	}

}
