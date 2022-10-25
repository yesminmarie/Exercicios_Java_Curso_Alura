package OrientacaoAObjetos.Modelo;

public class ContaPoupanca extends Conta{

     /**
      * Construtor para inicializar o objeto a partir da agencia e numero
      *
      * @param agencia
      * @param numero
      */
     public ContaPoupanca(int agencia, int numero) {

          super(agencia, numero);
     }

     @Override
     public String toString() {

          return "ContaPoupanca, " + super.toString();
     }
}
