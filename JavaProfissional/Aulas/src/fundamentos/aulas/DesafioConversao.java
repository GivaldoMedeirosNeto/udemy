package fundamentos.aulas;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o  seu Primeiro Sal�rio: ");
		String pSalario = entrada.next().replace(",", ".");
		double salario1 = Double.parseDouble(pSalario);
		
		System.out.print("Informe o  seu Segundo Sal�rio: ");
		String sSalario = entrada.next().replace(",", ".");
		double salario2 = Double.parseDouble(sSalario);
		
		System.out.print("Informe o  seu Terceiro Sal�rio: ");
		String tSalario = entrada.next().replace(",", ".");
		double salario3 = Double.parseDouble(tSalario);
		
		System.out.println("A soma dos salarios foi de R$ " + (salario1+salario2+salario3));
		System.out.println("Sua m�dia � de R$ " + (salario1+salario2+salario3)/3);
		
		entrada.close();
	}

}
