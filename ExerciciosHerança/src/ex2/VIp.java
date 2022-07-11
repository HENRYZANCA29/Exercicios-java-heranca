package ex2;

public class VIp extends Ingresso {

	private double vip;
	
	public VIp(double valor) {
		super(valor);
	}
	
	public double IngressoVip(double valor) {
		vip =this.getValor(valor) *5.1;
		return vip;
	}
	public void Imprime() {
		System.out.print("valor do ingresso vip: "+IngressoVip(vip));
		
	}
	
	
}
