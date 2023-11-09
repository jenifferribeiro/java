package aula_03;

import java.util.Scanner;

public class ParImpar {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int a;
		
		System.out.println("Digite um número: ");
		a = leia.nextInt();
		
		if(a % 2 == 0 && a >= 0) {
			System.out.printf("O numero " + a + " é par e positivo!");	
		} else if (a % 2 == 0 && a <= 0) {
			System.out.printf("O numero " + a + " é par e negativo!");
		} else if (a % 2 != 0 && a >= 0) {
			System.out.printf("O numero " + a + " é ímpar e positivo!");
		}else if (a % 2 != 0 && a <= 0) {
			System.out.printf("O numero " + a + " é ímpar e negativo!");
		}

	}

}
