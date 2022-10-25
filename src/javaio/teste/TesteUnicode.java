package javaio.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicode {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String c = "ç";
		System.out.println(c.codePointAt(0));
		
		byte[] bytes = c.getBytes();
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		System.out.println(bytes.length + ", UTF-8");
		String cNovo = new String(bytes);
		System.out.println(cNovo);
		
		bytes = c.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		cNovo = new String(bytes, "windows-1252");
		System.out.println(cNovo);
		
		bytes = c.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");
		cNovo = new String(bytes, "UTF-16");
		System.out.println(cNovo);
		
		bytes = c.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US-ASCII");
		cNovo = new String(bytes, "US-ASCII");
		System.out.println(cNovo);
	}

}
