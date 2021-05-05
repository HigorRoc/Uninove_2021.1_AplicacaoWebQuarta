package aula01_classes;

public class Principal {

	public static void main(String[] args) {
		
		Cliente[] clientes = new Cliente[5];
		clientes[0] = new Cliente("Maria", "111", "222");
		clientes[1] = new Cliente("José", "333", "444");
		clientes[2] = new Cliente("Franscisco", "555", "666");
		clientes[3] = new Cliente("Claúdia", "777", "888");
		clientes[4] = new Cliente("Higor", "999", "000");
		
		
		for(Cliente cliente:clientes){
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("RG: " + cliente.getRg());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("----------------------------");
		}

	}
}
