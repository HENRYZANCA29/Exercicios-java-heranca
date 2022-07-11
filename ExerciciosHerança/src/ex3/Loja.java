package ex3;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome,autor;
		int faixas, minutos, op;
		double preco;
		
		System.out.println("---|PRODUTOS DA LOJA|---");
		System.out.println("--- 1-livros");
		System.out.println("--- 2-CDs");
		System.out.println("--- 3-DVDs");
		System.out.println("--- 4-SAIR");
		System.out.print("Escola Uma opção:");
		op = sc.nextInt();
		if(op==1) {
			System.out.print("Nome do livro: ");
			nome = sc.next();
			System.out.print("Autor do livro: ");
			autor = sc.next();
			System.out.print("Preço do livro: R$");
			preco = sc.nextDouble();
			
			Livro l = new Livro(nome, preco, autor);
			l.Imprime();
		}else if(op == 2){
			System.out.print("Nome do CD: ");
			nome = sc.next();
			System.out.print("Quantidade de faixas do CD: ");
			faixas=sc.nextInt();
			System.out.print("Preço do CD: ");
			preco=sc.nextDouble();
			Cd cd = new Cd(nome, preco, faixas);
			cd.Imprime();
		}else if(op==3) {
			System.out.print("Nome do DVD: ");
			nome = sc.next();
			System.out.print("tempo de Filme: ");
			minutos = sc.nextInt();
			System.out.print("Preço do DVD: ");
			preco = sc.nextDouble();
			Dvd dvd = new Dvd(nome, preco, minutos);
			dvd.Imprime();
		}else if(op==4){
			System.out.println("Saindo...");
			System.out.println("Ate mais :) ");
		}
		
		
	}

}
