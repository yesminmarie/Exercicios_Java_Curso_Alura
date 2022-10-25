package ListasSetsMapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Yesmin Marie");
		alunos.add("Pedro Souza");
		alunos.add("João da Silva");
		alunos.add("Ana Lopes");
		alunos.add("Maria da Silva");
		alunos.add("Rafael Souza");
		alunos.add("Yesmin Marie");
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		for (String aluno: alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos.size());
		
		boolean yesminEstaMatriculada = alunos.contains("Yesmin Marie");		
		System.out.println(yesminEstaMatriculada);
		
		boolean adicionou = alunos.add("Yesmin Marie");
		System.out.println(adicionou);
	}

}
