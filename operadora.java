package pacote;

import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valor = 50.00;
		
		System.out.print("Digite a quantidade de minutos consumida: ");
		minutos = sc.nextInt();
		
		
		
		double comp = (minutos>100)? valor = valor + (minutos - 100) * 2.0:valor;
 		
		
//		if (minutos>100) {
//			valor = valor + (minutos - 100) * 2.0;
//		} 
		
		System.out.printf("Valor total: R$ %.2f%n", comp);
		
		
		sc.close();
		

	}

}
