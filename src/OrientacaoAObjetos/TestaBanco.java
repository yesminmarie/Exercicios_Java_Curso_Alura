package OrientacaoAObjetos;

import OrientacaoAObjetos.Modelo.Administrador;
import OrientacaoAObjetos.Modelo.Cliente;
import OrientacaoAObjetos.Modelo.Conta;

public class TestaBanco {
     public static void main(String[] args){
          Cliente yesmin = new Cliente();
//          yesmin.nome = "Yesmin Marie";
//          yesmin.cpf = "111.111.111-11";
//          yesmin.profissao = "Software Engeneering";

          Conta conta = new Conta(123456, 987654);
          conta.deposita(100);

          conta.setTitular(yesmin);
          //System.out.println("Nome do titular: "+ conta.getTitular().nome + ", CPF: " + conta.getTitular().cpf);

          //os dois possuem mesma referencia
          System.out.println("Referencia do objeto: " + conta.getTitular());
          System.out.println("Referencia do objeto " + yesmin);

          System.out.println("-------------------");
          Conta c1 = new Conta(147852, 369741);
          Conta c2 = new Conta(321789, 654712);
          Conta ce = new Conta(852654, 8429531);

          Administrador administrador = new Administrador();
          administrador.setNome("Maria");
          administrador.setSenha(123);


          System.out.println("Nome: " + administrador.getNome() + " Senha: " + administrador.autentica(321));

          System.out.println(Conta.getTotal());
     }
}
