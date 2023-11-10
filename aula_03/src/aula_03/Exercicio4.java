package aula_03;

import java.util.Scanner;

public class Exercicio4 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String palavra1, palavra2, palavra3;
		
		System.out.println("Digite a primeira palavra: ");
		palavra1 = leia.nextLine();
		System.out.println("Digite a segunda palavra: ");
		palavra2 = leia.nextLine();
		System.out.println("Digite a terceira palavra: ");
		palavra3 = leia.nextLine();
		
		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.contentEquals("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("Pomba");
				}
			}if (palavra2.contentEquals("mamifero")) {
				if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				} else {
					System.out.println("Vaca");
				}
			}	
		} else {
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				} else {
					System.out.println("Lagarta");
				} 
			} else {
				if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("Minhoca");
				}else {
					System.out.println("Sanguessuga");
				}
			}
		}
	}
}
