import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String s = "texto para ser gravado no arquivo";

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))) {// try serve para testar o
																							// código e caso dê erro
																							// tudo feito antes é
																							// apagado para não se criar
																							// arquivos corrompidos
			escrever.write(s);
		}

	}

}
