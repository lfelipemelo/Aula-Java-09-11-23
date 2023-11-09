package pacote;

import java.util.Scanner;

public class Tarefinha31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade, c, n;
		double soma, media;
		
		soma = 0.0;
		
		System.out.print("Digite o número de pessoas: ");
		n = sc.nextInt();
		
		
		for (c = 1; c <= n; c++) {
						
			System.out.println("Dados da " + c + "ª pessoa: ");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			sc.nextLine();
			
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			System.out.println("Nome: " + nome);
			System.out.printf("Idade: %d%n", idade);
			soma = soma + idade;
			
						
		}
		
		media = soma/n;
		
		System.out.printf("A idade média das pessoas é igual a %.1f anos", media);
		
		sc.close();

	}

}
