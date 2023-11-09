package aula_03;

import java.util.Scanner;

public class TabelaCompra {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String prod;
		int cod,quantidade;
		float total, valor;
		
		System.out.println("Cardápio: ");
		System.out.println("1 - Cachorro Quente R$10,00");
		System.out.println("2 - X-Salada R$15,00");
		System.out.println("3 - X-Bacon R$18,00");
		System.out.println("4 - Bauru R$12,00");
		System.out.println("5 - Refrigerante R$8,00");
		System.out.println("6 - Suco de Laranja R$13,00");
		
		System.out.println("Código do produto: ");
		cod = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(cod) {
		case 1:
			prod = "Cachorro quente";
			valor = 10.00f;
			break;
		case 2:
			prod = "X-Salada";
			valor = 10.00f;
			break;
		case 3:
			prod = "X-Bacon";
			valor = 18.00f;
			break;
		case 4:
			prod = "Bauru";
			valor = 12.00f;
			break;
		case 5:
			prod = "Refrigerante";
			valor = 8.00f;
			break;
		case 6:
			prod = "Suco de laranja";
			valor = 13.00f;
			break;	
			default:
				prod = "Não existe!";
				valor = 0;
				
		
		}
		
		total = (quantidade * valor);
		System.out.println("Produto: " + prod);
		System.out.println("Total: " + total);
		
		

	}

}
