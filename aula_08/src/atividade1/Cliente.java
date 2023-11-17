package atividade1;

public class Cliente {

	private String nome, endereço, email;
	private int idade, sexo;
	
	public Cliente(String nome, String endereço, String email, int idade, int sexo) {
		this.nome = nome;
		this.endereço = endereço;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	public void visualizar() {
		String tipo = "";
		
		switch (this.sexo) {
		case 1:
			tipo = "Feminino";
			break;
		case 2:
			tipo = "Masculino";
			break;
		case 3:
			tipo = "Outro";
			break;
		}
		System.out.println("\n\n****************************");
		System.out.println("Dados da cliente");
		System.out.println("********************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Sexo: " + tipo);
		System.out.println("Idade: " + this.idade);
		System.out.println("Endereço: " + this.endereço);
		System.out.println("Email: " + this.email);

	}
	
	
}
