package OrientacaoAObjetos;

import OrientacaoAObjetos.Modelo.ContaCorrente;
import OrientacaoAObjetos.Modelo.ContaPoupanca;

public class TestaBanco2 {
     public static void main(String[] args){
          Object contaCorrente = new ContaCorrente(11, 123);
          Object contaPoupanca = new ContaPoupanca(22, 456);

          System.out.println(contaCorrente);
          System.out.println(contaPoupanca);
     }
}
