package ListasSetsMapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 15));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 26));
		
		// vai dar erro, pois o metodo getAulas() retorna uma copia de uma lista não modificavel
		//javaColecoes.getAulas().add(new Aula("Teste aula", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
