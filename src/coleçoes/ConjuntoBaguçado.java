package coleçoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguçado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		
		conjunto.add("Teste");
		
		System.out.println("Tamanho é " + conjunto.size());
		System.out.println(conjunto.remove("x"));
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.add(nums); //uniao entre dois conjutos
		conjunto.retainAll(nums); //interceção entre dois conjuntos
		System.out.println(conjunto);
		
		
		conjunto.clear();
		
		System.out.println(conjunto);
		
	}

}
