package aula_04;

import java.util.Scanner;

public class Exercicio4 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String continua = "S";
		int idade, genero, pessoaDesenvolvedora; 
		int backend = 0, mulheresCisETrans = 0, homensCisETrans = 0, naoBinarios = 0;
		float mediaIdade, totalPesquisa = 0.0f, somaIdade = 0.0f;
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Idade: ");
			idade = leia.nextInt();
			System.out.println("Identidade de Gênero: 1 – Mulher Cis / 2 – Homem Cis / 3 – Não Binário /"
					+ "4 – Mulher Trans / 5 – Homem Trans / 6 – Outros ");
			genero = leia.nextInt();
			System.out.println("Pessoa Desenvolvedora: 1 – Backend / 2 – Frontend / 3 – Mobile / 4 – FullStack");
			pessoaDesenvolvedora = leia.nextInt();
			
			if (pessoaDesenvolvedora == 1) {
				backend ++;
			} if ((genero == 1 || genero == 4) && (pessoaDesenvolvedora == 2)){
				mulheresCisETrans ++;
			}if ((genero == 2 || genero == 5) && (pessoaDesenvolvedora == 3) && (idade > 40)){
				homensCisETrans ++;
			}if ((genero == 3 && pessoaDesenvolvedora == 4) && (idade < 30)){
				naoBinarios ++;
			}
			
			totalPesquisa ++;
			somaIdade += idade;
			
			System.out.println("Deseja continuar (S/N)? "); //condição para continuar o laço while ou não
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
		}
		
		mediaIdade = somaIdade/totalPesquisa;
		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCisETrans);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensCisETrans);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinarios);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPesquisa);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
		
	}

}
