package controle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a M�dia: ");
		double media = entrada.nextDouble();
		
		/* Bloco de codigo menos usual */
		if(media >= 7)
			System.out.println("Aprovado!");
		
		if(media >= 5)
			System.out.println("Em Recupera��o!");
		
		if(media < 5)
			System.out.println("Reprovado!");
		
		/* Bloco de codigo intermediario usual  */
		boolean mediaAprovacao = media <= 10 && media >=7;
		
		if(mediaAprovacao) {
			System.out.println("Aprovado.");
		}
		
		/* Bloco de codigo mais usual */
		
		if(media <=10 && media >=7) {
			System.out.println("Apovado");
		} else if (media < 7 && media >= 4) {
			System.out.println("Recupera��o");
		} else if (media < 4 && media >=0) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Numero inv�lido");
		}
		
		entrada.close();
	}
	
}
