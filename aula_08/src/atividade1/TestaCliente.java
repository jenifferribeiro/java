package atividade1;


public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente ("Jeniffer","Rua das rosas", "jeni@123.com", 26, 1);
		Cliente c2 = new Cliente ("Larissa", "Avenida do azul", "laris@123.com", 20, 1);
		
		c1.visualizar();
		c2.visualizar();
		
		PessoaFisica pf1 = new PessoaFisica ("Jeniffer","Rua das rosas", "jeni@123.com", 26, 1, "123.456.789-10");
		pf1.visualizar();
		PessoaFisica pf2 = new PessoaFisica ("Larissa", "Avenida do azul", "laris@123.com", 20, 1, "123.456.789-10");
		pf2.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica ("Jeniffer","Rua das rosas", "jeni@123.com", 26, 1, "00.000.000/0001-XX");
		pj1.visualizar();
		PessoaJuridica pj2 = new PessoaJuridica ("Larissa", "Avenida do azul", "laris@123.com", 20, 1, "10.000.000/0001-XX");
		pj2.visualizar();

	}

}
