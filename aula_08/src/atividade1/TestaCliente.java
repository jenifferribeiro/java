package atividade1;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente ("Jeniffer","Rua das rosas", "jeni@123.com", 26, 1);
		Cliente c2 = new Cliente ("Larissa", "Avenida do azul", "laris@123.com", 20, 1);
		
		c1.visualizar();
		c2.visualizar();

	}

}
