package OrientacaoAObjetos.Modelo;

import OrientacaoAObjetos.AutenticacaoUtil;
import OrientacaoAObjetos.Autenticavel;

public class Cliente implements Autenticavel {

     private String nome;

     public String getNome() {

          return nome;
     }

     public void setNome(String nome) {

          this.nome = nome;
     }

     private AutenticacaoUtil autenticador;

     public Cliente(){

          this.autenticador = new AutenticacaoUtil();
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
