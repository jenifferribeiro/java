package aula_02;

import java.util.Scanner;

public class DiferencaProduto {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite o 1º valor: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o 2º valor: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o 3º valor: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o 4º valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença é: " + diferenca);

	}

}
