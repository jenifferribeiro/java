package atividade2;

public class Vendedor extends Funcionario {
	
	private int id;

	public Vendedor(String nome, String telefone, int funcao, int nivel, float salario, int id) {
		super(nome, telefone, funcao, nivel, salario);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("ID: " + this.id);
	}
}
