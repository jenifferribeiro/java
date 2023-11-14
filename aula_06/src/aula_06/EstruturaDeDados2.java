package aula_06;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class EstruturaDeDados2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		int opcao;
		String nome;

		while (true) {
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livro na pilha");
			System.out.println("3 - Retirar livro na pilha");
			System.out.println("0 - Sair");
			System.out.println("Digite a opção desejada: ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("Programa finalizado");
				System.exit(0);
			}

			switch(opcao) {
			case 1:
				System.out.println(" Adicione um livro na pilha");
				System.out.println("Digite o nome do livro:");
				leia.skip("\\R");
				nome = leia.nextLine();
				
				pilha.add(nome);
				System.out.println("Livro adicionado na pilha!");
				
				break;
				
			case 2:
				System.out.println("Listar livros na pilha");
				Iterator<String> iPilha = pilha.iterator();
			
				while(iPilha.hasNext())
					System.out.println(iPilha.next());
				
				break;
				
			case 3:
				System.out.println("Remover um livro da fila");
				
				if(pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				}else {
					pilha.pop();
					System.out.println("Livro removido da pilha");
				}
				break;
				default:
					System.out.println("Opção Inválida");
					break;
			}
			
		}
	}

}
