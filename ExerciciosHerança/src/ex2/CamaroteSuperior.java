package ex2;

public class CamaroteSuperior extends Ingresso {

	
	public CamaroteSuperior (double valor) {
		super(valor);
	}
	
	public double CS( ) {
		return this.getValor()*6.3;
	}
	public Imprime() {
		 System.out.println("valor do ingresso do camarote superior "+CS());
	}
	
}
