package ListasSetsMapas;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [nome=");
		builder.append(nome);
		builder.append(", numeroMatricula=");
		builder.append(numeroMatricula);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && numeroMatricula == other.numeroMatricula;
	}

	@Override
	public int compareTo(Aluno aluno) {
		
		return this.nome.compareTo(aluno.getNome());
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		Aluno aluno = (Aluno) obj;
//		return this.nome.equals(aluno.getNome());
//	}
//	
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}
}
