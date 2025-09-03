package classe.desafio;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		
		int x = 0;
		double y = 0.0;
		Scanner entrada = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		Comida c = new Comida();
		
		System.out.print("Qual o seu nome: ");
		p.nome = entrada.nextLine();
			
		System.out.print("Qual o seu Peso: ");
		p.peso = entrada.nextDouble();
		
		System.out.println();
		System.out.println(p.apresentar());
		System.out.println();
		
		System.out.println("Escolha a op��o abaixo:");
		System.out.println("1 - Arroz");
		System.out.println("2 - Feij�o");
		System.out.println("3 - Macarr�o");
		System.out.println("4 - Carne");
		System.out.println("5 - Frango");
		System.out.println("6 - Batata Frita");
		System.out.println("0 - Sair");	
		
		do{
			System.out.print("menu: ");
			x = entrada.nextInt();
						
			switch (x) {
			case 0:
				break;
			case 1:
				c.nome = "Arroz";
				c.peso = 0.180;
				y += c.peso;
				p.comer(c);
				break;
			case 2:
				c.nome = "Feij�o";
				c.peso = 0.300;
				y += c.peso;
				p.comer(c);
				break;
			case 3:
				c.nome = "Macarr�o";
				c.peso = 0.230;
				p.comer(c);
				y += c.peso;
				break;
			case 4:
				c.nome = "Carne";
				c.peso = 0.450;
				y += c.peso;
				p.comer(c);
				break;
			case 5:
				c.nome = "Frango";
				c.peso = 0.350;
				y += c.peso;
				p.comer(c);
				break;
			case 6:
				c.nome = "Batata Frita";
				c.peso = 0.210;
				y += c.peso;
				p.comer(c);
				break;
			default:
				System.out.println("Op��o Inv�lida, informe o menu correto, por favor");
			}
			
			if(x > 0 && x <= 6) {
				System.out.println("Voc� comeu...");
				System.out.println(c.comer());
			}
			
			if(x ==0) {
				System.out.printf(p.nome + ", voc� est� com %.2fkgs\n", p.peso);
				System.out.printf("Total de sua refei��o foi de %.2fkgs",y);
				
			}
						
		} while(x != 0);
		
		entrada.close();
		
	}
	
}
