package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioEstruturaDeDados1 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		int cod;
		String nome;
		
		do {
		
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada: ");
			cod = leia.nextInt();
			
			switch(cod) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.next();
				fila.add(nome);
				for(var sequencia: fila) {
					System.out.println(sequencia);
				}
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes na Fila: ");
				for(var sequencia: fila) {
					System.out.println(sequencia);
				}
				break;
			case 3:
				if(!fila.isEmpty()) {
					fila.remove();
					System.out.println("Fila: ");
					for(var sequencia: fila) {
						System.out.println(sequencia);
					}
					System.out.println("O cliente foi Chamado!");
					
				} else {
				System.out.println("A Fila está vazia!");
				}
				break;
			
				
			}
		} while (cod != 0);
		System.out.println("Programa Finalizado!");

	}

}
