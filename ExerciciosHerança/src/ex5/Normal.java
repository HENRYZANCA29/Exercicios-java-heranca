package ex5;

public class Normal extends Funcionario {

	public Normal(String nome, String cpf, String id, double salario) {
		super(nome, cpf, id, salario);
		// TODO Auto-generated constructor stub
	}
	
	public double salarioNormal() {
		return this.getSalario()*1.1;
	}
	public void Imprime() {
		System.out.println("Funcionario: "+this.getNome());
		System.out.println("Salario do salario normal e: "+salarioNormal());
		System.out.println("cpf: "+this.getCpf());
		System.out.println("ID: "+this.getId());
		System.out.printf("O salario normal e: %f2",salarioNormal());
	}

	
	
	
	
	
	
	
}
