package ex4;

public class Velho extends Imovel{

	public double precoVelho;

	public double PrecoVelho() {
		precoVelho = preco + 10;
				return precoVelho;
	}

	

	
	public void Imprime() {
		System.out.println("Preço barato e de "+precoVelho);
	}
	

	
}
