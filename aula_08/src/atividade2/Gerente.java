package atividade2;

public class Gerente extends Funcionario {

	private String setor;
	
	public Gerente(String nome, String telefone, int funcao, int nivel, float salario, String setor) {
		super(nome, telefone, funcao, nivel, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Setor: " + this.setor);
	}
}
