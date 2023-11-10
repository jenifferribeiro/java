package aula_04;

import java.util.Scanner;

public class TabuadaV2 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero, contador = 1; // iniciando contador
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		while ( contador <= 10) { // limitando o valor do contador
		System.out.println(numero + " x " + contador + " = "  + (numero * contador));
		contador ++; // incrementando o contador
		}

	}

}
