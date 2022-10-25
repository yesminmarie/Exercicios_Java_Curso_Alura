package Enums;

public enum Prioridade {


     NORMAL(5),
     MAX(10),
     MIN(1);

     private int valor;

     Prioridade(int valor){
          this.valor = valor;
     }

     public int getValor(){
          return this.valor;
     }
}
