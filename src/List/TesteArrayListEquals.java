package List;

import java.util.ArrayList;

import OrientacaoAObjetos.Modelo.Conta;
import OrientacaoAObjetos.Modelo.ContaCorrente;

public class TesteArrayListEquals {
     public static void main(String[] args){
          ArrayList<Conta> lista = new ArrayList<>();

          Conta cc = new ContaCorrente(11, 111);
          lista.add(cc);

          Conta cc2 = new ContaCorrente(22, 222);
          lista.add(cc2);

          Conta cc3 = new ContaCorrente(22, 222);
          boolean existe = lista.contains(cc3);

          System.out.println("Já existe? " + existe);

          for(Conta conta : lista) {
               if(conta.equals(cc3)) {
                    System.out.println("Já tenho essa conta!");
               }
          }
     }
}
