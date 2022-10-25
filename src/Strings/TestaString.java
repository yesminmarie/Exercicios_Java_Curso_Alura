package Strings;

public class TestaString {
     public static void main(String[] args){
          String nome = "Alura";

          String outra1 = nome.replace("Alu", "aLU");
          String outra2 = nome.replace('A', 'a');
          System.out.println(outra1);
          System.out.println(outra2);

          char c = nome.charAt(2);
          char c2 = nome.charAt(4);
          System.out.println(c);
          System.out.println(c2);

          int pos = nome.indexOf("ur");
          int pos2 = nome.indexOf("lu");
          System.out.println(pos);
          System.out.println(pos2);

          String sub = nome.substring(1);
          System.out.println(sub);

          System.out.println("---------------");
          System.out.println(nome.length());
          System.out.println("---------------");
          for (int i=0; i<nome.length(); i++){
               System.out.println(nome.charAt(i));
          }
          System.out.println("---------------");

          String vazio = " ";
          String outroVazio = vazio.trim();
          System.out.println(vazio.isEmpty());
          System.out.println(outroVazio.isEmpty());

          System.out.println("---------------");
          String nome2 = "    Alura      ";
          System.out.println(nome2.contains("Alu"));

          System.out.println("---------------");
          CharSequence seq = "é uma sequencia de caracteres";
          System.out.println(seq);

          String texto = "Socorram";
          texto = texto.concat("-");
          texto = texto.concat("me");
          texto = texto.concat(", ");
          texto = texto.concat("subi ");
          texto = texto.concat("no ");
          texto = texto.concat("ônibus ");
          texto = texto.concat("em ");
          texto = texto.concat("Marrocos");
          System.out.println(texto);
     }
}
