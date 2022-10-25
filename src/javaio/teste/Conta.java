package javaio.teste;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta
 *
 * @author Yesmin
 *
 */
public class Conta implements Comparable<Conta>, Serializable{
     private double saldo;
     private int agencia;
     private int numero;
     private Cliente titular;
     private static int total;

     /**
      * Construtor para inicializar o objeto a partir da agencia e numero
      *
      * @param agencia
      * @param numero
      */
     public Conta(int agencia, int numero){
          if (agencia < 1){
               throw new IllegalArgumentException("Agência Inválida");
          }
          if(numero < 1){
               throw new IllegalArgumentException("Número da conta inválido");
          }
          this.agencia = agencia;
          this.numero = numero;
          System.out.println("Criando conta, agencia: " + this.agencia + ", numero: " + this.numero);
          Conta.total ++;
     }
     public void deposita(double valor){

          this.saldo += valor;
     }

     public double getSaldo(){

          return this.saldo;
     }

     public int getNumero(){

          return this.numero;
     }

     public Cliente getTitular(){
          return this.titular;
     }

     public void setTitular(Cliente titular){

          this.titular = titular;
     }

     public static int getTotal(){

          return Conta.total;
     }

     @Override
     public String toString() {

          return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
     }

     @Override
     public boolean equals(Object ref){

          Conta outra = (Conta) ref;

          if(this.agencia != outra.agencia){
               return false;
          }

          if(this.numero != outra.numero){
               return false;
          }

          return true;
     }

     @Override
     public int compareTo(Conta outra) {

          return Double.compare(this.saldo, outra.saldo);
     }
}
