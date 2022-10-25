package Enums;

public class Teste {
     public static void main(String[] argd){

          Prioridade pMIN = Prioridade.MIN;
          Prioridade pMAX = Prioridade.MAX;
          Prioridade pNORMAL = Prioridade.NORMAL;

          System.out.println(pMIN.name());

          System.out.println(pMIN.ordinal());
          System.out.println(pNORMAL.ordinal());
          System.out.println(pMAX.ordinal());

          System.out.println("----------------");
          System.out.println(pMIN.getValor());
          System.out.println(pMAX.getValor());
          System.out.println(pNORMAL.getValor());

          System.out.println("----------------");
          System.out.println(Cores.AZUL);
          System.out.println(Cores.VERDE.name());
          System.out.println(Cores.AMARELO.ordinal());
     }
}
