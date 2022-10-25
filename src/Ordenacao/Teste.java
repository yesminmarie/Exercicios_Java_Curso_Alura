package Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import OrientacaoAObjetos.Modelo.Cliente;
import OrientacaoAObjetos.Modelo.Conta;
import OrientacaoAObjetos.Modelo.ContaCorrente;
import OrientacaoAObjetos.Modelo.ContaPoupanca;

public class Teste {
     public static void main(String[] args){
          Conta c1 = new ContaCorrente(33, 333);
          Cliente clienteC1 = new Cliente();
          clienteC1.setNome("Maria");
          c1.setTitular(clienteC1);
          c1.deposita(333);

          Conta c2 = new ContaPoupanca(44, 444);
          Cliente clienteC2 = new Cliente();
          clienteC2.setNome("Joao");
          c2.setTitular(clienteC2);
          c2.deposita(444);

          Conta c3 = new ContaCorrente(22, 222);
          Cliente clienteC3 = new Cliente();
          clienteC3.setNome("Ana");
          c3.setTitular(clienteC3);
          c3.deposita(111);

          Conta c4 = new ContaPoupanca(11, 111);
          Cliente clienteC4 = new Cliente();
          clienteC4.setNome("Pedro");
          c4.setTitular(clienteC4);
          c4.deposita(222);

          List<Conta> lista = new ArrayList<>();
          lista.add(c1);
          lista.add(c2);
          lista.add(c3);
          lista.add(c4);

          System.out.println("-----------------");
          for(Conta conta: lista){
               System.out.println(conta);
          }

          //NumeroDaContaComparator comparator = new NumeroDaContaComparator();
          //TitularDaContaComparator comparatorString = new TitularDaContaComparator();

          System.out.println("-----------------");
          //lista.sort(new NumeroDaContaComparator()); //forma depois do Java 8
          //Collections.sort(lista, new NumeroDaContaComparator()); // forma antes do Java 8
          //Collections.reverse(lista);
          //Collections.sort(lista); //usando a ordem natural. Vai usar o metodo compareTo da classe Conta
          //lista.sort(null); //usando a ordem natural (depois do Java 8), mas é má prática passar null como parâmetro

          lista.sort((cc1, cc2) -> Integer.compare(cc1.getNumero(), cc2.getNumero()));

          for(Conta conta: lista){
               System.out.println(conta);
          }

          System.out.println("-----------------");

          Comparator<Conta> comp = (Conta cc1, Conta cc2) -> {

                    String nomeC1 = cc1.getTitular().getNome();
                    String nomeC2 = cc2.getTitular().getNome();
                    return nomeC1.compareTo(nomeC2);
          };

          lista.sort(comp);

          lista.forEach((conta) -> System.out.println(conta + " Nome: " + conta.getTitular().getNome()));
     }

}