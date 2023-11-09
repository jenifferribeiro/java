package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome;
		int faixaIdade;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Faixas Etárias: ");
		System.out.println("1 - De 0 a 10 anos");
		System.out.println("2 - De 11 a 29 anos");
		System.out.println("3 - De 30 a 45 anos");
		System.out.println("4 - De 46 a 59 anos");
		System.out.println("5 - De 60 a 65 anos");
		System.out.println("6 - Acima de 65 anos");
		
		System.out.print("\nDigite o sua faixa etária: ");
		faixaIdade = leia.nextInt();
		
		switch(faixaIdade) {
		case 1: //  seria parecido  com if (faixa idade == 1)
			System.out.printf("%s o seu Plano de Saúde custará R$100,00 por mês.", nome);
			break;
		case 2:
			System.out.printf("%s o seu Plano de Saúde custará R$200,00 por mês.", nome);
			break;
		case 3:
			System.out.printf("%s o seu Plano de Saúde custará R$300,00 por mês.", nome);
			break;
		case 4:
			System.out.printf("%s o seu Plano de Saúde custará R$500,00 por mês.", nome);
			break;
		case 5:
			System.out.printf("%s o seu Plano de Saúde custará R$600,00 por mês.", nome);
			break;
		case 6:
			System.out.printf("%s o seu Plano de Saúde custará R1000,00 por mês.", nome);
			break;
			default:
				System.out.println("\nFaixa etária inválida!");
		}

	}

}
