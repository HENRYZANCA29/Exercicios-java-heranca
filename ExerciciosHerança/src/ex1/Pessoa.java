package ex1;

public class Pessoa {
	
	private String nome;
	
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public void Imprime() {
		System.out.println("nome: "+nome);
		System.out.println("CPF: "+cpf);
	}

}
