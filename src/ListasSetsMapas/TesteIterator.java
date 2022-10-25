package ListasSetsMapas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteIterator {

	public static void main(String[] args) {
		
		//Como acessar elementos de um set antes do Java 5
		
		Curso curso = new Curso("Orientação a Objetos", "Yesmin Marie");
		
		curso.adiciona(new Aula("Encapsulamento", 20));
		curso.adiciona(new Aula("Polimorfismo", 25));
		curso.adiciona(new Aula("Herança", 15));
		
		curso.matricula(new Aluno("Pedro da Silva", 789));
		curso.matricula(new Aluno("João da Silva", 123));
		curso.matricula(new Aluno("Maria Souza", 456));
		curso.matricula(new Aluno("Ana", 246));
		
		Set<Aluno> alunos = curso.getAlunosMatriculados();
		
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next()); 
		}

	}

}
