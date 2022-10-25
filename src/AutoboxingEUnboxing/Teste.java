package AutoboxingEUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Teste {
     public static void main(String[] args){
          int idade = 29;
          Number idadeRef = Integer.valueOf(29); //autoboxing
          System.out.println(idadeRef.doubleValue());
          int valor = idadeRef.intValue(); //unboxing

          System.out.println(valor);

          List<Integer> numeros = new ArrayList<Integer>();
          numeros.add(idade);

          System.out.println(numeros);

          System.out.println("-------------");
          String s = args[0];
          Integer numero = Integer.valueOf(s);
          int numeroPrimitivo = Integer.parseInt(s);

          System.out.println(numero);
          System.out.println(numeroPrimitivo);

          System.out.println(Integer.MAX_VALUE);
          System.out.println(Integer.MIN_VALUE);
          System.out.println(Integer.SIZE);
          System.out.println(Integer.BYTES);

          Boolean bRef = Boolean.FALSE;
          System.out.println(bRef.booleanValue());

          List<Number> lista = new ArrayList<>();
          lista.add(10);
          lista.add(32.6);
          lista.add(25.6f);

     }
}
