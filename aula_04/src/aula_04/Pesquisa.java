package aula_04;

import java.util.Scanner;

public class Pesquisa {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade, esporte, futebol = 0, voleiM18 = 0, basqueteMen18  = 0, outros = 0;
		String continua = "S";
		
		while (continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
			System.out.println("Digite o seu esporte favorito (1-Fut / 2-vol / 3-Basq / 4- outros: ");
			esporte = leia.nextInt();
			} while (esporte <1 || esporte > 4); // foi fechado com ; pq esta entre do e while ( escopo começa do do e termina no while)
			// Quantas pessoas gostam de futebol
			if (esporte == 1) {
				futebol ++;
			}
			
			// Quantas pessoas gostam de volei e são maiores de 18 anos
			if (esporte == 2 && idade > 18) {
				voleiM18 ++;
			}
			
			// Quantas pessoas gostam de basquete e são menores de 18 anos
			if (esporte == 3 && idade < 18) {
				basqueteMen18 ++;
			}
			
			
			// Quantas pessoas gostam de outros esportes
			if (esporte == 4) {
				outros ++;
			}
			
			System.out.println("Deseja continuar (S/N)? "); //condição para continuar o laço while ou não
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
		}
		
		System.out.println("Total de pessoas que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de volei e são maiores de 18 anos: " + voleiM18);
		System.out.println("Total de pessoas que gostam de basquete e são menores de 18 anos: " + basqueteMen18);
		System.out.println("Total de pessoas que gostam de outros esportes: " + outros);
	}

}
