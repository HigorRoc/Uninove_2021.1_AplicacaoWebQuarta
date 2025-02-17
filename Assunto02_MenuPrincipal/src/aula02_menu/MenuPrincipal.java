package aula02_menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import aula01_classes.Cliente;

public class MenuPrincipal {

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<>();

		Scanner leitor = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("--------------------------");
			System.out.println("      MENU PRINCIPAL      ");
			System.out.println("--------------------------");
			System.out.println("");

			System.out.println("1. CADASTRAR CLIENTE");
			System.out.println("2. MOSTRAR TODOS OS CLIENTES");
			System.out.println("3. MOSTRAR O CLIENTE DESEJADO");
			System.out.println("4. ALTERAR DADOS DO CLIENTE");
			System.out.println("5. EXCLUIR CLIENTE");
			System.out.println("6. SAIR DO SISTEMA");
			System.out.println("");

			System.out.print("Escolha a op��o desejada: ");
			try {
				opcao = leitor.nextInt();
			}catch(InputMismatchException e) {
				opcao = 0;
			}
			
			switch (opcao) {

			/////////////////////////////////////////////////////////////////
			case 1:
				System.out.println("CADASTRANDO CLIENTE...");
				System.out.println("");

				System.out.print("Nome: ");
				String nome = leitor.next();

				System.out.print("RG: ");
				String rg = leitor.next();

				System.out.print("CPF: ");
				String cpf = leitor.next();

				clientes.add(new Cliente(nome, rg, cpf));
				System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
				System.out.println("");
				break;

			/////////////////////////////////////////////////////////////////
			case 2:
				System.out.println("MOSTRANDO OS CLIENTES...");
				System.out.println("");

				for (Cliente cliente : clientes) {
					System.out.println("Nome: " + cliente.getNome());
					System.out.println("RG: " + cliente.getRg());
					System.out.println("CPF: " + cliente.getCpf());
					System.out.println("");
				}
				System.out.println("");
				break;

			/////////////////////////////////////////////////////////////////
			case 3:
				System.out.print("INFORME O NOME DO CLIENTE: ");
				String nomePesquisa = leitor.next();

				for (int i = 0; i < clientes.size(); i++) {
					String nomeDoVetor = clientes.get(i).getNome();

					if (nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {
						System.out.println("Nome: " + clientes.get(i).getNome());
						System.out.println("RG: " + clientes.get(i).getRg());
						System.out.println("CPF: " + clientes.get(i).getCpf());
						break;
					}
				}
				System.out.println("");
				break;

			/////////////////////////////////////////////////////////////////
			case 4:
				System.out.print("INFORME O CLIENTE QUE DESEJA ALTERAR: ");
				nomePesquisa = leitor.next();

				for (int i = 0; i < clientes.size(); i++) {
					String nomeDoVetor = clientes.get(i).getNome();

					if (nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {
						System.out.print("Nome: ");
						clientes.get(i).setNome(leitor.next());

						System.out.print("RG: ");
						clientes.get(i).setRg(leitor.next());

						System.out.print("CPF: ");
						clientes.get(i).setCpf(leitor.next());

						break;
					}
				}

				System.out.println("CLIENTE ALTERADO COM SUCESSO!");
				System.out.println("");
				break;

			/////////////////////////////////////////////////////////////////
			case 5:
				System.out.print("INFORME O CLIENTE QUE DESEJA REMOVER: ");
				nomePesquisa = leitor.next();

				for (int i = 0; i < clientes.size(); i++) {
					String nomeDoVetor = clientes.get(i).getNome();

					if (nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {
						clientes.remove(i);
						break;
					}
				}

				System.out.println("CLIENTE REMOVIDO COM SUCESSO!");
				System.out.println("");
				break;

			/////////////////////////////////////////////////////////////////
			case 6:
				System.out.println("SISTEMA FINALIZADO!");
				System.out.println("");
				break;

			/////////////////////////////////////////////////////////////////
			default:
				System.out.println("OP��O INV�LIDA");
				System.out.println("");
				break;
			}

		} while (opcao != 6);

		leitor.close();
	}
}

//System.out.println("A Op��o escolhida �: " + opcao);
//Cliente cliente = new Cliente(nome, rg, cpf);
//clientes.add(cliente);

//Exclus�o usar o remove