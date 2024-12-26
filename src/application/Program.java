package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	
	/*Map: uma coleção de pares chave valor
	 * elementos indexados pelo objeto chave (não tem pos
	 * acesso, inserção e remoção de elementos são rapidos
	 * 
	 * HashMap - mais rápido porém não ordenado
	 * TreeMap - mais lento e ordenado pelo CompareTo
	 * LinkedHashMap - velocidade intermediária e elementos de ordem em que são adicionados
	 * 
	 * put(key, value), remove(key), containsKey(key), get(key), clear(), size(), keySet() - retorna um Set<K>, values() - retorna um Collection<V>
	 */

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		
		cookies.put("phone", "99771133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES: ");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
