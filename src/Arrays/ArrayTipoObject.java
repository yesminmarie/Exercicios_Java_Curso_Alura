package Arrays;

import OrientacaoAObjetos.Modelo.Cliente;
import OrientacaoAObjetos.Modelo.Conta;
import OrientacaoAObjetos.Modelo.ContaCorrente;
import OrientacaoAObjetos.Modelo.ContaPoupanca;

public class ArrayTipoObject {
     public static void main(String[] args){
          Object[] referencias = new Object[5];

          ContaCorrente cc1 = new ContaCorrente(123, 6789);
          referencias[0] = cc1;

          ContaPoupanca cp1 = new ContaPoupanca(321, 9876);
          referencias[1] = cp1;

          Cliente cliente = new Cliente();
          referencias[2] = cliente;

          //System.out.println(referencias[1].getNumero());

          ContaPoupanca ref = (ContaPoupanca) referencias[1];
          Object referenciaGenerica = referencias[1];

          System.out.println(ref.getNumero());
     }
}
