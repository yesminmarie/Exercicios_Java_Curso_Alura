package NovidadesJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.forEach(c->System.out.println(c.getNome()));
		
		System.out.println("--------------");
		
		//Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
		//streamDeCurso.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("--------------");
		
		//retorna Integer
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		System.out.println("--------------");
		
		//retorna int
		cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.mapToInt(Curso::getAlunos)
		.forEach(System.out::println);
		
		System.out.println("--------------");
		
		//soma
		int soma = cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.mapToInt(Curso::getAlunos)
		.sum();
		
		System.out.println("Soma: " + soma);
		
		System.out.println("--------------");
		
		//findAny
		Optional<Curso> cursoOptional = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.findAny();
		
		//se não exisitir curso retorna null
		Curso curso = cursoOptional.orElse(null);
		
		//ifPresent melhor opção para evitar null, ifs e exceptions
		cursoOptional.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("--------------");
		
		//passando de Stream para List
		cursos = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toList());
		
		cursos.forEach(c -> System.out.println("Nova lista de cursos: " + c.getNome()));
		
		//passando de Stream para Map
		Map<String, Integer> mapaCursos = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		
		mapaCursos.keySet().forEach(c -> System.out.println("Chave: " + c));
	}
}
