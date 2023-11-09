package pacote;

import java.util.Scanner;

public class CalculadoraDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x = 0 , y = 0, resultado = 0;
		String op, comp;
		
		do {
		
		System.out.println("---- Bem vindos a nossa Calculadora ---");
		System.out.println("---------------------------------------");
		System.out.println("Qual operação você deseja realizar? \nSoma (+), Subtração (-), Divisão (/) e Multiplicação (*)");
		
		op = sc.next();
		
		System.out.print("Digite o primeiro número: ");
		x = sc.nextDouble();	
		
		System.out.print("Digite o segundo número: ");
		y = sc.nextDouble();
		
		if (op.equals("+")) {
			resultado = x + y;
			System.out.printf("Resposta = %.2f", resultado);
		} else if (op.equals("-")) {
			resultado = x - y;
			System.out.printf("Resposta = %.2f", resultado);
		} else if (op.equals("*")) {
			resultado = x * y;
			System.out.printf("Resposta = %.2f", resultado);
		} else if (op.equals("/") && y == 0) {
			System.out.println("Resultado Inválido!");
		
		} else {
			resultado = x/y;
			System.out.printf("Resposta = %.2f", resultado);
			
		}
 		
		System.out.println();
		System.out.println("Deseja continuar? 's' para Continuar ou qualquer tecla para encerrar");
		comp = sc.next();
		
		
		
		} while (comp.equalsIgnoreCase("s"));

		sc.close();
		
		
	}

}
