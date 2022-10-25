package Arrays;

import OrientacaoAObjetos.Modelo.ContaCorrente;

public class TesteArraysConta {
     public static void main(String[] args){
          ContaCorrente[] contas = new ContaCorrente[5];

          ContaCorrente cc1 = new ContaCorrente(11, 123);

          contas[0] = cc1;

          ContaCorrente cc2 = new ContaCorrente(22, 456);
          contas[1] = cc2;
          ContaCorrente ref = contas[1];

          System.out.println(contas[0]);

          //System.out.println(cc2.getNumero());
          System.out.println(ref.getNumero());
     }
}
