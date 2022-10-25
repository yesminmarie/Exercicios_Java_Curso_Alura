package javaio.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCurrentTimeMillis {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long ini = System.currentTimeMillis();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        bw.close();
        
        long fim = System.currentTimeMillis();
        
        System.out.println("Passaram: " + (fim-ini) + " milissegundos");

	}

}
