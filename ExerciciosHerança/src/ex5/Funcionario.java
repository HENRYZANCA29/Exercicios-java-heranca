package ex5;

public class Funcionario {
	
	private String nome, cpf, id; 
	public String getNome() {
		return nome;
	}


	public Funcionario(String nome, String cpf, String id, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getCpf() {
		return cpf;
	}



	private double salario;
	


	
		
	
	
}
