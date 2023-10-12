package coleçoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>(); //coleção do tipo chave valor 

		usuarios.put(1, "roberto"); //adiciono elemento, ou sobrescreve o dado
		usuarios.put(2, "luana");
		usuarios.put(3, "lucas");
		usuarios.put(4, "lunhana");
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); //verifica se esta vazia
		
		System.out.println(usuarios.keySet()); // retorna todas as chaves 
		
		System.out.println(usuarios.values()); //apenas os valores
		
		System.out.println(usuarios.entrySet()); // chave e valor ao mesmo tempo
		
		System.out.println(usuarios.containsKey(1)); // verifica se essa chave existe
		
		System.out.println(usuarios.containsValue("luana")); // verifica se o valor existe
		
		System.out.println(usuarios.get(1)); // retorna o valor da chave 
		
		// como percorrer um map --> primeiro percorremos a  chave com o foreach 
		for (int chave : usuarios.keySet()) { // defino chave com int pois e a chave é interger
			
			System.out.println(chave); 
		}
		
		// percorrer os valores 
		
		for (String valor : usuarios.values()) { // laço foreach com string 
			
			System.out.println(valor); //retona o valor
		}
		
		// forma de percorrer chave e valor  --> Entry de java.util.map
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) { // metodos de map para percorrer todos os elementos
			
			System.out.print(registro.getKey() + " "); // retorna a chave 
			System.out.print(registro.getValue()); //retorna o  valor 
			//System.out.println(registro); //retona os dois chave e valor 
		}
		
	}

}
