package aula_03;

import java.util.Scanner;

public class MaiorMenorIgual {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a,b,c;
		 
		System.out.println("Digite o 1º número: ");
		a = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		b = leia.nextInt();
		
		System.out.println("Digite o 3º número: ");
		c = leia.nextInt();
		
		if (a + b > c) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (a + b < c){
			System.out.println("A Soma de A + B é Menor do que C");
		}else if (a + b == c) {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		

	}

}
