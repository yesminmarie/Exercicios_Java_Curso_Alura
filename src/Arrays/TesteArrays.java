package Arrays;

public class TesteArrays {
     public static void main(String[] args){
          int[]idades = new int[5];

          //idades[0] = 30;

          //int idade1 = idades[0];

          //System.out.println(idades.length);

          System.out.println("----------------------");

          for(int i=0; i<idades.length; i++){
               idades[i] =  i*i;
          }

          for(int i=0; i<idades.length; i++){
               System.out.println(idades[i]);
          }

          System.out.println("-----------------");

          int[] numeros = {1, 2, 3, 4, 5};
          for(int i=0; i<numeros.length; i++){
               System.out.println(numeros[i]);
          }
          System.out.println(numeros[5]);
     }
}
