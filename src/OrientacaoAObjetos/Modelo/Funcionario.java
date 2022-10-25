package OrientacaoAObjetos.Modelo;

public abstract class Funcionario {
     private String nome;
     private String cpf;
     protected double salario;

     public abstract double getBonificacao();

     public String getNome() {

          return nome;
     }

     public String getCpf() {

          return cpf;
     }

     public double getSalario() {

          return salario;
     }

     public void setNome(String nome) {

          this.nome = nome;
     }

     public void setCpf(String cpf) {

          this.cpf = cpf;
     }
}
