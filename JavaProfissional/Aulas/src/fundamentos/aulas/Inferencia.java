package fundamentos.aulas;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // Declara��o e Inicializa��o da vari�vel
		System.out.println(a); // Mostrando a vari�vel
		
		var b = 3.4; // Inferencia de uma vari�vel
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		
		double d; // Declarando a vari�vel
		d = 123.12; // Inicializando a vari�vel
		System.out.println(d); // Mostrando a vari�vel
		
		
		var e = "teste";
		System.out.println(e);
		e = "Teste 2";
		System.out.println(e);
		
	}
}
