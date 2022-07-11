package ex4;

import java.util.Scanner;

public class Venda extends Imovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String endereco;
		double preco;
		int op;
	      Scanner sc = new Scanner(System.in);	

	      
	      System.out.println("endereço ");
	      endereco=sc.next();
	      System.out.println("valor da casa: ");
	      preco = sc.nextDouble();
	      System.out.println("---opções---");
	      System.out.println("   1-nova");
          System.out.println("   2-velha");
          op = sc.nextInt();
          if(op == 1) {
        	  Novo n = new Novo(preco);
        	n.Imprime();	  
         }else if(op==2){
        	 Velho v = new Velho();
        	 v.Imprime();
         }else {
	 System.out.println("invalido");
         }
          
          
	}

}
