package javaio.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestePrintStream {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream ps = new PrintStream("lorem2.txt");
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintStream console = System.out;
		console.print("Teste console");
		
		ps.println("teste teste teste aaaaaaaaaaaa");
		ps.println();
		ps.println("Ultima linha");
		ps.close();

	}

}
