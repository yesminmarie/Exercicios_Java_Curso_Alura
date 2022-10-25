package Strings;

public class TestaStringBuilder {
     public static void main(String[] args){
          StringBuilder builder = new StringBuilder("Socorram");
          builder.append("-");
          builder.append("me");
          builder.append(", ");
          builder.append("subi ");
          builder.append("no ");
          builder.append("ônibus ");
          builder.append("em ");
          builder.append("Marrocos");

          String texto = builder.toString();
          System.out.println(texto);

          System.out.println("--------------");

          String nome = "ALURA";
          CharSequence cs = new StringBuilder("al");

          nome = nome.replace("AL", cs);

          System.out.println(nome);
     }
}
