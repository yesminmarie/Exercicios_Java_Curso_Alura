package OrientacaoAObjetos.Modelo;

public class ContaCorrente extends Conta{

     public ContaCorrente(int agencia, int numero){

          super(agencia, numero);
     }

     @Override
     public String toString() {

          return "ContaCorrente, " + super.toString();
     }
}
