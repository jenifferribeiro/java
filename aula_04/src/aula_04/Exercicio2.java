package aula_04;

import java.util.Scanner;

public class Exercicio2 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int numero = 0, par = 0, impar = 0;
		
		for (int contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite o " + contador + "º número:");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				par ++;
			} else if (numero % 2 != 0){
				impar ++;
			}
			
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);

	}

}
