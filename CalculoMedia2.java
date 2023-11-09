package pacote;

import java.util.Locale;
import java.util.Scanner;

public class CalculoMedia2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notafinal;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		notafinal = (nota1+nota2)/2;
		
		System.out.printf("Nota final = %.1f%n", notafinal);
		
		String situacao = (notafinal < 6)? "Reprovado!":"Aprovado!"; 
		
		System.out.println(situacao);
		
		sc.close();
		

	}

}
