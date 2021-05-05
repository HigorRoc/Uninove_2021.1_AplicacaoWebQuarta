package aula01_classes;

import java.util.ArrayList;

public class ListaClientes {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria");
		cliente1.setRg("000");
		cliente1.setCpf("999");
		
		clientes.add(cliente1);
		clientes.add(new Cliente("João","888","777"));
		
		for(Cliente cliente:clientes) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("RG: " + cliente.getRg());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("----------------------------");
		}
		
		System.out.println("====================================");
		clientes.add(new Cliente("Higor","666","555"));
		clientes.add(new Cliente("Amanda","444","333"));
		
		for(Cliente cliente:clientes) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("RG: " + cliente.getRg());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("----------------------------");
		}
		
		System.out.println("====================================");
		clientes.remove(1);
	}

}
