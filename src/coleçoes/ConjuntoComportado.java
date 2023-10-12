package coleçoes;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class ConjuntoComportado {

	public static void main(String[] args) {
		
	//Set<String> listaDeAprovados = new HashSet<>();
    SortedSet<String> listaDeAprovados = new TreeSet<>();
       listaDeAprovados.add("luana");
       listaDeAprovados.add("gerson");
       listaDeAprovados.add("lucas");
       listaDeAprovados.add("lucia");

    
	
	for (String cadidatos : listaDeAprovados) {
		
		System.out.println(cadidatos);
	}
	
	Set<Integer> nums = new HashSet<>();
	    
	nums.add(1);
	nums.add(2);
	
	for (Integer integer : nums) {
		
		System.out.println(integer);
	}
		
	}
	
}
