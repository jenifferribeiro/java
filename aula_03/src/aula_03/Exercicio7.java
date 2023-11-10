package aula_03;

import java.util.Scanner;

public class Exercicio7 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		float numero1, numero2;
		int codigo;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("1 - soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		System.out.println("Digite o código da operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;
			default:
				System.out.println("Operação Inválida!");
			
		}
		
		

	}

}
