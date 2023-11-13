package aula_05;

import java.util.Scanner;

public class Exercicio4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float[][] notas = new float[10][4];
		float[] media = new float[10];
		float total;

		for (int indiceI = 0; indiceI < notas.length; indiceI++) { // primeiro for linha
			for (int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ++) { // segundo for coluna
				System.out.print("Nota: ");
				notas[indiceI][indiceJ] = leia.nextFloat();
			}
		}
		
		for(int indiceI = 0; indiceI < notas.length; indiceI ++) {
			total = 0;
			for(int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ ++)  {
				total += notas [indiceI][indiceJ];
			}
			media[indiceI] = total/4;
		}
		
		System.out.println("Média: ");
		for(int indice = 0; indice < media.length; indice ++)
			System.out.printf(" %.1f | ", media[indice]);
		

	}

}
