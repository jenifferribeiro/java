package aula_03;

import java.util.Scanner;

public class Exercicio8 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int codigo;
		float saldo = 1000.00f, valor;
		
		System.out.println("1 - saldo");
		System.out.println("2 - saque");
		System.out.println("3 - depósito");
		System.out.println("Digite o código da operação: ");
		codigo = leia.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("Seu saldo é: " + saldo);
			break;
		case 2:
			System.out.println("Informe o valor do saque: ");
			valor = leia.nextFloat();
			
			if (saldo >= valor) {
				System.out.println("O novo saldo é: " + (saldo - valor));
			} else {
				System.out.println("Saldo insulficiente!");
			}
			break;
		case 3 :
			System.out.println("Informe o valor do depósito: ");
			valor = leia.nextFloat();
			
			System.out.println("O novo saldo é: " + (saldo + valor));
			break;
			default:
				System.out.println("Operação inválida!");
		}
		
		

	}

}
