package OrientacaoAObjetos.Modelo;

import OrientacaoAObjetos.AutenticacaoUtil;
import OrientacaoAObjetos.Autenticavel;
import OrientacaoAObjetos.Modelo.Funcionario;

public class Gerente extends Funcionario implements Autenticavel {

     private AutenticacaoUtil autenticador;

     public Gerente(){

          this.autenticador = new AutenticacaoUtil();
     }
     @Override
     public double getBonificacao() {

          return super.salario;
     }

     @Override
     public void setSenha(int senha) {

          this.autenticador.setSenha(senha);
     }

     @Override
     public boolean autentica(int senha) {

          return this.autenticador.autentica(senha);
     }
}
