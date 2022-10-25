package ListasSetsMapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 15));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 26));
		
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.reverse(aulas);
		System.out.println("Reverse: " + aulas);
		
		Collections.sort(aulas);
		System.out.println("Sort: " + aulas);
		
		Collections.reverse(aulas);
		System.out.println("Reverse: " + aulas);
		
		Collections.shuffle(aulas);
		System.out.println("Shuffle: " + aulas);
		
		List<Aula> singletonListTeste = Collections.singletonList(aulas.get(0));
		System.out.println("SingletonList: " + singletonListTeste);
		//nao aceita adicionar lançando UnsupportedOperationException
		//singletonListTeste.add(new Aula("Teste", 22));
		
		List<Aula> lista1000PrimeiraAula = new ArrayList<Aula>(Collections.nCopies(1000, aulas.get(0)));
		System.out.println("nCopies: " + lista1000PrimeiraAula);
		
		List<String> lista1000Null = new ArrayList<String>(Collections.nCopies(1000, (String)null));
		System.out.println(lista1000Null);
		
		System.out.println("Tempo total: " + javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
	}

}
