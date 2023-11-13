package aula_05;

import java.util.Scanner;

public class Exercicio1 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		int numero;
		int posicao = -1;
		
		System.out.println("Digite o número: ");
		numero = leia.nextInt();
		
		
		for(int indice = 0; indice < vetor.length; indice++) {
			if(vetor[indice] == numero) {
				posicao = indice;
			}
		}
		if(posicao != -1) {
			System.out.println("O numero " + numero + " está localizado na posição: " + posicao);
		}else {
			System.out.println("O numero " + numero + " não foi encontrado!");
		}
		
		

	}

}
