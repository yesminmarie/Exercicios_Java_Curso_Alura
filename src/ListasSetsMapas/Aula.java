package ListasSetsMapas;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aula [titulo=");
		builder.append(titulo);
		builder.append(", tempo=");
		builder.append(tempo);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}
	
}
