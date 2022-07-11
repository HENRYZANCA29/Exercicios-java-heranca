package ex5;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String nome,cpf,id;
		double salario;
		int op;
	

		
		System.out.println("FUncionario: ");
nome = sc.next();	
System.out.println("Cpf: ");
cpf=sc.next();
	System.out.println("Id: ");
	id=sc.next();
	System.out.println("Salario: ");
	salario=sc.nextDouble();
	System.out.println("opções");
	System.out.println("1 funcionario");
	System.out.println("2 Estagiario");
	System.out.println("3 chefe");
	op = sc.nextInt();
	
	if(op==1) {
		Normal n = new Normal(nome, cpf, id, salario);
			n.Imprime();
	}else if(op==2){
		Estagiario e = new Estagiario(nome, cpf, id, salario);
				e.Imprime();
	}else if(op==3) {
		Chefe c = new Chefe(nome, cpf, id, salario);
		c.Imprime();}
		
	}
	
	
	
	
	
	
	
	
	}

