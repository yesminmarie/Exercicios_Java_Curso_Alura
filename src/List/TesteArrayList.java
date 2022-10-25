package List;

import java.util.ArrayList;

import OrientacaoAObjetos.Modelo.Conta;
import OrientacaoAObjetos.Modelo.ContaCorrente;
import OrientacaoAObjetos.Modelo.ContaPoupanca;

public class TesteArrayList {
     public static void main(String[] args){
          ArrayList<Conta> lista = new ArrayList<>();
          Conta cc = new ContaCorrente(11, 1111);
          Conta cp = new ContaPoupanca(22, 2222);
          Conta cc2 = new ContaCorrente(33, 3333);
          Conta cp2 = new ContaPoupanca(44, 4444);

          lista.add(cc);
          lista.add(cp);

          System.out.println("Tamanho: "+lista.size());

          //Object ref = lista.get(0);
          Conta ref = lista.get(0);

          lista.remove(0);

          lista.add(cc2);
          lista.add(cp2);
          System.out.println("-------For-------");

          for(int i=0; i<lista.size(); i++){
               Object oRef = lista.get(i);
               System.out.println(oRef);
          }

          System.out.println("--------------");

          for(Conta o: lista) {
               System.out.println(o.getNumero());
          }

          System.out.println(ref.getNumero());


          System.out.println("Tamanho: "+lista.size());



     }
}
