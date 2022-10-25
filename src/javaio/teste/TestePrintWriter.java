package javaio.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TestePrintWriter {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		PrintWriter pw = new PrintWriter("lorem2.txt", "UTF-8");
		
		pw.println("teste teste teste printwriter");
		pw.println();
		pw.println("Ultima linha");
		pw.close();

	}

}
