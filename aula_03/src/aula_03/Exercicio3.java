package aula_03;

import java.util.Scanner;

public class Exercicio3 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean resposta;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? ");
		resposta = leia.nextBoolean();
		
		if(idade < 18 || idade > 69) {
			System.out.println(nome + " não está apto para doar sangue!");
		} else if ((idade >= 60 && idade <= 69) && (resposta == true)) {
			System.out.println(nome + " não está apto para doar sangue!");
		} else {
			System.out.println(nome + " está apto para doar sangue!");
		}
		
		
	}

}
