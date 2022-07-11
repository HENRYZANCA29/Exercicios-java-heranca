package ex5;

public class Chefe extends Normal {

	public Chefe(String nome, String cpf, String id, double salario) {
		super(nome, cpf, id, salario);
		// TODO Auto-generated constructor stub
	}
public double salarioChefe;
public Chefe(String nome, String cpf, String id, double salario, double salarioChefe) {
	super(nome, cpf, id, salario);
	this.salarioChefe = salarioChefe;
}
	public double salarioChefe() {
		return this.salarioNormal()*1.2;
	}

}
