package ListasSetsMapas.Mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(123, "Maria");
		pessoas.put(456, "João");
		pessoas.put(789, "Ana");
		
		pessoas.keySet().forEach(id->System.out.println(id));
		
		System.out.println("----------------------");
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		
		nomesParaIdade.put("Pedro", 26);
		nomesParaIdade.put("Camila", 19);
		nomesParaIdade.put("Rafael", 28);
		nomesParaIdade.put("Gabriela", 5);
		
		Set<String> chaves = nomesParaIdade.keySet();
		
		for(String nome : chaves) {
			System.out.println(nome);
		}
		
		System.out.println("----------------------");
		
		Collection<Integer> valores = nomesParaIdade.values();
		
		for(Integer idade : valores) {
			System.out.println(idade);
		}
		
		System.out.println("----------------------");
		
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		
		for(Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao);
			//System.out.println(associacao.getKey() + "-" + associacao.getValue());
		}
	}

}
