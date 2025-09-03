package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Recupera��o";
		System.out.println(media.apply(9.8, 5.7));
		System.out.println(media.andThen(conceito).apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Recupera��o";
		
		BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Recupera��o";
			
		};
		
		System.out.println(resultado.apply(9.7, 5.1));
		System.out.println(resultado2.apply(8.1, 4.9));		
		
	}

}
