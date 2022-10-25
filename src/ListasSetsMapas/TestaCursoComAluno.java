package ListasSetsMapas;

import java.util.HashSet;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso curso = new Curso("Orientação a Objetos", "Yesmin Marie");
		
		curso.adiciona(new Aula("Encapsulamento", 20));
		curso.adiciona(new Aula("Polimorfismo", 25));
		curso.adiciona(new Aula("Herança", 15));
		
		curso.matricula(new Aluno("Pedro da Silva", 789));
		curso.matricula(new Aluno("João da Silva", 123));
		curso.matricula(new Aluno("Maria Souza", 456));
		curso.matricula(new Aluno("Ana", 246));
		
		curso.getAlunosMatriculados().forEach(aluno->System.out.println(aluno.getNome()));
		
		Aluno a4 = new Aluno("Camila", 321);
		curso.matricula(a4);
		
		System.out.println("------------------");
		curso.getAlunosMatriculados().forEach(aluno->System.out.println(aluno.getNome()));

		Aluno camila = new Aluno("Camila", 321);
		
		System.out.println("O a5 é equals a Camila?");
		System.out.println(a4.equals(camila));
		
		System.out.println("O aluno " + a4.getNome() + " está matriculado? " + curso.estaMatriculado(a4));
		System.out.println("E esse aluno (Camila, 321), está matriculado? " + curso.estaMatriculado(camila));
		
	}

}
