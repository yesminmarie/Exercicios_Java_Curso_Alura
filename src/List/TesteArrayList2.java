package List;

import java.util.ArrayList;

public class TesteArrayList2 {
     public static void main(String[] args){
          ArrayList lista = new ArrayList(26);
          lista.add("SP");
          lista.add("RJ");
          System.out.println(lista);

          ArrayList nova = new ArrayList(lista);
          System.out.println(nova);
     }
}
