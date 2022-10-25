package NovidadesJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		
		palavras.add("Morango");
		palavras.add("Casa");
		palavras.add("Arvore");
		
		palavras.sort((p1, p2)->Integer.compare(p1.length(), p2.length()));
		
		System.out.println(palavras);
		
		palavras.forEach(p->System.out.println(p));
		
		System.out.println("--------------");
		
		palavras.sort((p1,p2) -> p1.compareTo(p2));
		System.out.println(palavras);
		
		//antes
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		//depois
		new Thread(()->System.out.println("Executando um Runnable")).start();

	}

}
