package aula6.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ExemploLeituraArquivo {

	private static final Charset CHARSET = Charset.forName("UTF-8");

	public static void main(String[] args) throws IOException {
		gravarArquivo();
		lerArquivo();

		gravarArquivoComWriter();
		lerArquivoComReader();
	}

	private static void gravarArquivoComWriter() throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(
				"/home/java01/exemplo_writer.txt"))) {

			writer.write("Gravando em arquivo usando writer");
		}
	}

	private static void lerArquivoComReader() throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"/home/java01/exemplo_writer.txt"))) {

			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

	private static void lerArquivo() throws IOException {
		try (FileInputStream fileInputStream = new FileInputStream(
				"/home/java01/exemplo.txt")) {

			byte buffer[] = new byte[1024];
			int read = -1;
			while ((read = fileInputStream.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, read, CHARSET));
			}
		}
	}

	private static void gravarArquivo() throws IOException,
			FileNotFoundException {

		String conteudoDoArquivo = "Meu primeiro arquivo usando java";

		try (FileOutputStream out = new FileOutputStream(
				"/home/java01/exemplo.txt")) {
			out.write(conteudoDoArquivo.getBytes(CHARSET));
		}
	}
}
