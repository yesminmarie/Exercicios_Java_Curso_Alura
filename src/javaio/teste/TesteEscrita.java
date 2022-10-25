package javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita {
     public static void main(String[] args) throws IOException {
    	 
          OutputStream fos = new FileOutputStream("lorem2.txt");
          Writer osw = new OutputStreamWriter(fos);
          BufferedWriter bw = new BufferedWriter(osw);

          bw.write("Primeira linha");
          bw.newLine();
          bw.newLine();
          bw.write("Última linha");
          
          bw.close();
     }
}
