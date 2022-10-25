package NovidadesJava8;

import java.util.ArrayList;
import java.util.List;

public class Testes {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		
		palavras.add("Morango");
		palavras.add("Casa");
		palavras.add("Arvore");
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavras);

	}

}
