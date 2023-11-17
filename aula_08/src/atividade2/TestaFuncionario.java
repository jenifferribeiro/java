package atividade2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario c1 = new Funcionario ("Maria", "000055550", 2, 2, 8500.00f);
		Funcionario c2 = new Funcionario ("João", "000044450", 1, 3, 4200.00f);
		
		c1.visualizar();
		c2.visualizar();

	}

}
