package javaio.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteCSV {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8.name());
		
		boolean tem = scanner.hasNextLine();
		System.out.println(tem);
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();
            
            //String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %010.2f", valor1, valor2, valor3, valor4, valor5);
            
            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %05.2f %n", valor1, valor2, valor3, valor4, valor5);
            
            linhaScanner.close();
        
		}
		
		scanner.close();
	}

}
