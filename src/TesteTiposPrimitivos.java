public class TesteTiposPrimitivos {
     public static void main(String[] args){
          double divisao = 5/2;
          System.out.println(divisao);

          double peso = 5;
          int quantidade = 2;
          //System.out.println(peso);
          System.out.println((peso / quantidade));

          System.out.println("-------------------");
          int numero = 2140000100;
          long numeroGrande = 20000000011L;
          System.out.println(numero);
          System.out.println(numeroGrande);

          short valorPequeno = 2321;
          byte b = 127;

          double numeroPontoFlutuante = 3.14;
          System.out.println("-------------------");
          System.out.println(numeroPontoFlutuante);
          float nunumeroPontoFlutuante = 3.14f;

          System.out.println("-------------------");
          char letra = 'a';
          System.out.println(letra);

          char valor = 67;
          System.out.println("67 = " + valor);

          valor = (char) (valor + 1);
          System.out.println(valor);
     }
}
