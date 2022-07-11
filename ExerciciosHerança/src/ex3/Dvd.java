package ex3;

public class Dvd extends Produto{

	private int minutos;
	
	
	public Dvd(String nome, double preco, int minutos) {
		super(nome, preco);
		this.minutos=minutos;
		// TODO Auto-generated constructor stub
	}

	public void Imprime() {
		System.out.println("O filme "+this.getNome()+" tem "+this.minutos
				+" minutos e custa R$ "+this.getPreco());
	}
	
	
}
