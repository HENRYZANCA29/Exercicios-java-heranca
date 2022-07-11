package ex2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		double valor;
		String localizacao;
		int op;

		System.out.println("Qual valor padrão do ingresso?: ");
		valor = sc.nextDouble();
		System.out.println("---Qual a opção desejada?---");
	    System.out.println("---1 normal---");
	    System.out.println("---2 vip---");
	    System.out.println("---3 camarote inferior---");
	    System.out.println("---4 camarote superior---");
	    System.out.println("---5   ---");
	    op = sc.nextInt();
	    if(op== 1) {
	    	Normal no = new Normal(valor);
	    	no.Imprime();
	    }else if(op==2){
	    	VIp vp = new VIp(valor);
	    	vp.Imprime();
	    }else if(op==3) {
	    	System.out.println("Qual localização do seu ingresso: ");
	    	localizacao=sc.next();
	    	CamaroteInferior ci = new CamaroteInferior(valor, localizacao);
	    	ci.Imprime();
	    }else if(op==4) {
	    	CamaroteSuperior CS = new CamaroteSuperior(valor);
	    	CS.CamaroteSuperior();
	    }else if (op==5) {
	    	System.out.println("Finalizando...");
	    }else {
	    	System.out.println("opção invalida");
	    }
	    
	    
	
	
	
	
	
	
	}

}
