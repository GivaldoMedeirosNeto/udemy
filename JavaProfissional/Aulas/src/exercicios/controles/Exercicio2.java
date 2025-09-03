package exercicios.controles;

import java.util.Scanner;

public class Exercicio2 {

	/*
	 * Criar um programa informa se o ano atual � um ano bissexto
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

		if (bissexto == true) {
			System.out.println(ano + " � um ano bissexto");
		} else {
			System.out.println(ano + " n�o � um ano bissexto");
		}
		
		scanner.close();
		
	}
	
}
