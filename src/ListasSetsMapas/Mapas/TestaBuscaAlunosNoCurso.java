package ListasSetsMapas.Mapas;

import ListasSetsMapas.Aluno;
import ListasSetsMapas.Aula;
import ListasSetsMapas.Curso;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Orientação a Objetos", "Yesmin Marie");
		
		curso.adiciona(new Aula("Encapsulamento", 20));
		curso.adiciona(new Aula("Polimorfismo", 25));
		curso.adiciona(new Aula("Herança", 15));
		
		curso.matricula(new Aluno("Pedro da Silva", 789));
		curso.matricula(new Aluno("João da Silva", 123));
		curso.matricula(new Aluno("Maria Souza", 456));
		curso.matricula(new Aluno("Ana", 246));
		
		curso.matricula(new Aluno("Bruno", 123));
		
		System.out.println("Quem é o aluno com matrícula 123?");
		Aluno aluno = curso.buscaAlunoPorMatricula(123);
		System.out.println("Aluno: " + aluno);

	}

}
