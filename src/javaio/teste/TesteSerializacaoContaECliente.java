package javaio.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoContaECliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//Serialização
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Yesmin Marie");
//		cliente.setCpf("12345678990");
//		cliente.setProfissao("Dev");
//		
//		Conta cc = new ContaCorrente(11, 1111);
//		cc.setTitular(cliente);
//		cc.deposita(100);
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
//		oos.writeObject(cc);
//		oos.close();
		
		//Desserialização
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		Conta cc = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.format("Saldo: %s, Titular: %s", cc.getSaldo(), cc.getTitular());
	}

}
