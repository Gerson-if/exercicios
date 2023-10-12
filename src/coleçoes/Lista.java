package coleçoes;

import java.util.ArrayList;
import java.util.Objects;

public class Lista {

   public static void main(String[] args) {
	 ArrayList<Usuario> lista = new ArrayList<>();
	 Usuario u1 = new Usuario("ana");
	 
	 lista.add(u1);
	 lista.add(new Usuario("gerson"));
	 lista.add(new Usuario("lia"));
	 lista.add(new Usuario("manu"));
	 lista.add(new Usuario("lola"));
	   
	 System.out.println(lista.get(3));
	 
	 lista.remove(1);
	  System.out.println(lista.remove(new Usuario("lia")));
	  System.out.println(lista.remove(2));
	  
	  System.out.println("tem");
	 for (Usuario u : lista) {
		
		 System.out.println(u);
	}
}

}
