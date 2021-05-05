package aula01_classes;

public class Cliente {

	//Construtor Personalizado
	public Cliente(String nome, String rg, String cpf) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}

	//Construtor Padrão
	public Cliente() {

	}

	//Propriedades ou Atributos
	private String nome;
	private String rg;
	private String cpf;

	//Métodos Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
