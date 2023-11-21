package atividade2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario c1 = new Funcionario ("Maria", "000055550", 2, 2, 8500.00f);
		Funcionario c2 = new Funcionario ("João", "000044450", 1, 3, 4200.00f);
		
		c1.visualizar();
		c2.visualizar();
		
		Gerente g1 = new Gerente ("Maria", "000055550", 2, 2, 8500.00f, "Comercial");
		Gerente g2 = new Gerente ("João", "000044450", 1, 3, 4200.00f, "Contabilidade");
		
		g1.visualizar();
		g2.visualizar();
		
		Vendedor v1 = new Vendedor ("Joaquina", "000055550", 2, 2, 8500.00f, 1235);
		Vendedor v2 = new Vendedor ("Valério", "000044450", 1, 3, 4200.00f, 1236);
		
		v1.visualizar();
		v2.visualizar();
		

	}

}
