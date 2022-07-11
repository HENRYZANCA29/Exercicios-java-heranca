package ex3;

public class Cd extends Produto {

	private int faixas;
	
	
	
	public Cd(String nome, double preco, int faixa) {
		super(nome, preco);
		this.faixas=faixas;
		// TODO Auto-generated constructor stub
	}
	public void Imprime() {
		System.out.println("O cd "+this.getNome()+", tem "+this.faixas+
				" faixas, que custa: R$"+ this.getPreco());
	}
	
}
