package ListasSetsMapas;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	//private Set<Aluno> alunos = new HashSet<>();
	//private Set<Aluno> alunos = new LinkedHashSet<>(); //guarda a ordem que os elementos foram adicionados
	private Set<Aluno> alunos = new TreeSet<>(); //TreeSet usa ordem natural para inserir os elementos (Comparable em Aluno)
	//private static int tempoTotal;
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso: ");
		builder.append(nome);
		builder.append(", tempo total: ");
		builder.append(this.getTempoTotal());
		builder.append(", instrutor=");
		builder.append(instrutor);
		builder.append(", aulas=");
		builder.append(aulas);
		builder.append("]");
		return builder.toString();
	}
	
	public void matricula(Aluno aluno) {
		//adiciona no Set de alunos
		this.alunos.add(aluno);
		
		//cria a relação no Map
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunosMatriculados(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaAlunoPorMatricula(int matricula) {
		return this.matriculaParaAluno.get(matricula);
	}
}
