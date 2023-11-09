package pacote;

import java.util.Locale;
import java.util.Scanner;

public class Tarefinha2 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Informe a base do retângulo: ");
		base = sc.nextDouble();
		
		System.out.print("Informe a altura do retângulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		perimetro = base*2 + altura*2;
		
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.printf("Área = %.4f%n", area);
		
		System.out.printf("Perímetro = %.4f%n", perimetro);
		
		System.out.printf("Diagonal = %.4f%n", diagonal);
		
		sc.close();
		
	}

}
