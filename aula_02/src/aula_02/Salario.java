package aula_02;

import java.util.Scanner;

public class Salario {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo salário: " + novoSalario);
		

	}

}
