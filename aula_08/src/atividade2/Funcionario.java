package atividade2;

public class Funcionario {
	
	private String nome, telefone;
	private int funcao, nivel;
	private float salario;
	
	public Funcionario(String nome, String telefone, int funcao, int nivel, float salario) {
		this.nome = nome;
		this.telefone = telefone;
		this.funcao = funcao;
		this.nivel = nivel;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getFuncao() {
		return funcao;
	}

	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void visualizar() {
		String tipo = "";
		
		switch (this.funcao ) {
		case 1 : 
			tipo = "Assistente";
			break;
		case 2:
			tipo = "Analista";
			break;
		case 3:
			tipo = "Supervisor";
			break;
		}
		
		String hierarquia = "";
		
		switch (this.nivel) {
		case 1:
			hierarquia = "Júnior";
			break;
		case 2:
			hierarquia = "Pleno";
		case 3:
			hierarquia = "Senior";
			break;
		}
		
		System.out.println("\n\n****************************");
		System.out.println("Dados da funcionário");
		System.out.println("********************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Função: " + tipo);
		System.out.println("Nível: " + hierarquia);
		System.out.println("Salário: " + this.salario);
	}
	
	
	
	

}
