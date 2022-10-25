package NovidadesJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

	public static void main(String[] args) {
		
List<String> palavras = new ArrayList<>();
		
		palavras.add("Morango");
		palavras.add("Casa");
		palavras.add("Arvore");
		
		//sem method reference
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);

		//com method reference
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		
		Function<String, Integer> funcao = s -> s.length();
		Function<String, Integer> funcao2 = String::length;
		
		palavras.forEach(System.out::println);
		
		
	}

}
