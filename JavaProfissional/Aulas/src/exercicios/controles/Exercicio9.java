package exercicios.controles;

import java.util.Scanner;

public class Exercicio9 {

	/*
	 * Crie um programa que recebe 10 valores e ao final imprima o maior n�mero.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 1;
		
		System.out.println("Informe 10 n�meros.");
		
		do {
			System.out.printf("Informe o  %d n�mero: ", contador);
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 11);

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();
		
	}
	
}
