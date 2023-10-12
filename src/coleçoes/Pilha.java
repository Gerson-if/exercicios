package coleçoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>(); //implementação de uma pilha 
		
		livros.add("o pequeno principe");
		livros.push("Don quixote");
		livros.push("O hobbite");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());

		
	
		

	}

}
