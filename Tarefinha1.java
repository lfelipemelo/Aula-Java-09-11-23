package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Tarefinha1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, area, valor, preco;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		area = largura*comprimento;
		
		System.out.print("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();
		
		preco = valor*area;
		
		System.out.printf("A área do terreno é igual a: %.2f%n", area);
		System.out.printf("O preço do terreno é igual a: %.2f%n", preco);
		
		sc.close();
		

	}

}
