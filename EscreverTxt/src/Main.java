import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String s = "texto para ser gravado no arquivo";

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))) {// try serve para testar o
																							// c�digo e caso d� erro
																							// tudo feito antes �
																							// apagado para n�o se criar
																							// arquivos corrompidos
			escrever.write(s);
		}

	}

}
