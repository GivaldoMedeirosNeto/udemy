package generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Ol� Teste");
		
		System.out.println(caixaA.abrir());
		
	}

}
