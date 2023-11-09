package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x, resultado;
		
		System.out.print("Digite um número para calcular o quadrado dele: ");
		x = sc.nextDouble();
		
		resultado = Math.pow(x, 2);
		
		System.out.printf("O quadrado do número é igual a : %.3f", resultado);


		sc.close();

	}

}




