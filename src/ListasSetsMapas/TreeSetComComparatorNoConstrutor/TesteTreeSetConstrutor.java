package ListasSetsMapas.TreeSetComComparatorNoConstrutor;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSetConstrutor {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Yesmin", 32);
		Funcionario f2 = new Funcionario("Ana", 26);
		Funcionario f3 = new Funcionario("José", 28);
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}

	}

}
