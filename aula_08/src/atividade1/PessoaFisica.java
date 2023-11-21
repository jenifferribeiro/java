package atividade1;

public class PessoaFisica extends Cliente {

	private String cpf;
	
	public PessoaFisica(String nome, String endereço, String email, int idade, int sexo, String cpf) {
		super(nome, endereço, email, idade, sexo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}

}
