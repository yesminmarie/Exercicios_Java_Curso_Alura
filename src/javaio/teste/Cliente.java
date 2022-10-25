package javaio.teste;

import java.io.Serializable;

public class Cliente implements Autenticavel, Serializable {

     private static final long serialVersionUID = 5302148914544237017L;
     
	 private String nome;
     private String cpf;
     private String profissao;
     private transient AutenticacaoUtil autenticador;

     public Cliente(){

    	 this.autenticador = new AutenticacaoUtil();
     }

     public String getNome() {

         return nome;
    }

    public void setNome(String nome) {

         this.nome = nome;
    }

     public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
