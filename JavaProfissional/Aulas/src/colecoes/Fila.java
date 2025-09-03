package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		/* 
		 * Add e Offer -> Adicionam elementos na fila
		 * diferen�a � o comportamento quando a fila es� cheia!
		*/
		fila.add("Penelope"); // retorna false
		fila.offer("Givaldo"); // lan�a uma exce��o
		fila.offer("Mayara");
		fila.offer("Kira");
		fila.offer("Twikki");
		
		System.out.println(fila);
		
		/*
		 * Element e Peek -> obter o proximo elemento da fila (sem remover)
		 * diferen�a � quando a fila est� vazia!
		 */
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek()); // lan�a uma exce��o
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		System.out.println(fila.size()); // Tamanho da Fila
		System.out.println(fila.isEmpty()); // Est� vazia
		System.out.println(fila.poll()); // Chama o primeiro e depois remove
		System.out.println(fila.remove()); // Chama o primeiro e depois remove, lan�a uma exce��o se estiver vazia
		
		System.out.println(fila);
		fila.clear();  //Limpar a Fila
		System.out.println(fila.isEmpty()); // Est� vazia
		
	}
	
}
