package NovidadesJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MetodosDefaultEmComparator {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		
		palavras.add("Morango");
		palavras.add("Casa");
		palavras.add("Arvore");
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);
		
		//ou
		Comparator<String> comparador = Comparator.comparing(s -> s.length());
		palavras.sort(comparador);
		System.out.println(palavras);
		
		//ou
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador2 = Comparator.comparing(funcao);
		palavras.sort(comparador2);
		System.out.println(palavras);
	}

}
