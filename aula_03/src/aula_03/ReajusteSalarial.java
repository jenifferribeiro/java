package aula_03;

import java.util.Scanner;

public class ReajusteSalarial {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String nomeColaborador, cargo;
		int codCargo;
		float salario, novoSalario;
		double reajuste;

		System.out.println("Nome do colaborador: ");
		nomeColaborador = leia.nextLine();
		System.out.println("Digite o código do cargo: ");
		codCargo = leia.nextInt();
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		switch(codCargo) {
		case 1:
			reajuste = 0.1;
			cargo = "Gerente";
			break;
		case 2:
			reajuste = 0.07;
			cargo = "Vendedor";
			break;
		case 3:
			reajuste = 0.09;
			cargo = "Supervisor";
			break;
		case 4:
			reajuste = 0.06;
			cargo = "Motorista";
			break;
		case 5:
			reajuste = 0.05;
			cargo = "Estoquista";
			break;
		case 6:
			reajuste = 0.08;
			cargo = "Técnico de TI";
			break;
			default:
				reajuste = 0;
				cargo = "Inválido";
		}
		novoSalario = (float) (salario + (reajuste * salario));
		System.out.println("Nome do colaborador: " + nomeColaborador);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + novoSalario);
	}

}
