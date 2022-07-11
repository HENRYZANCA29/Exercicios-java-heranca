package ex1;

import java.util.Scanner;

public class Geral {

	public static void main(String[] args) {
		String nome, cpf, id, ra;
		double salario;
		int op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- opcao de cadastro----");
		System.out.println("1 - aluno");
		System.out.println("2 - professor");
		System.out.println("3 - Funcionario");op = sc.nextInt();
		if (op == 1) {
			System.out.println("nome: ");
			nome = sc.next();
			System.out.println("CPF: ");
			cpf = sc.next();
			System.out.println(" ra");
			ra = sc.next();
			Aluno al = new Aluno(nome, cpf ,ra);
			al.Imprime();
			
		}else if(op == 2){
		System.out.println("nome: ");
		nome = sc.next();
		System.out.println("CPF: ");
		cpf = sc.next();
		System.out.println(" Salario");
		salario = sc.nextDouble();
		Professor pr = new Professor(nome, cpf ,salario);
		pr.Imprime();
		}else if(op==3) {
			System.out.println("nome: ");
			nome = sc.next();
			System.out.println("CPF: ");
			cpf = sc.next();
			System.out.println(" Salario");
			salario = sc.nextDouble();
			System.out.println(" ID");
			id = sc.next();
			Funcionario fu = new Funcionario(nome, cpf , salario, id);
		fu.Imprime();
		}
		
		}
			
		}
			
			
			
		
		
		
		

	
	


