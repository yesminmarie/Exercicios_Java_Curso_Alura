package javaio.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {
		
		//Essas linhas podem ser substituidas por FileWriter
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//      Writer osw = new OutputStreamWriter(fos);
//      BufferedWriter bw = new BufferedWriter(osw);
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Teste teste teste");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Última linha");
		
		bw.close();
	}

}
