package ex2;

public class CamaroteInferior extends Ingresso {

	private String localizacao;
	
	public CamaroteInferior(double valor, String localizacao) {
		super(valor);
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public double CI() {
		return this.getValor(0)*6*1;
	}
	public void Imprime( ) {
		System.out.println("valor do Ingresso do camarote inferior: "+CI());
		System.out.println("Localização: "+localizacao);
	}
	
	
	
	
	
	
	
}
