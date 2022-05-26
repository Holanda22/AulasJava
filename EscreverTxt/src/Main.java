import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

		Mouse mouse1 = new Mouse(false, 2, "pequeno");
		Mouse mouse2 = new Mouse(true, 5, "grande");
		Mouse mouse3 = new Mouse(true, 3, "médio");

		List<Mouse> mouses = new ArrayList<Mouse>();
		
		mouses.add(mouse1);
		mouses.add(mouse2);
		mouses.add(mouse3);

		try (BufferedWriter escrever2 = new BufferedWriter(new FileWriter("Mouses.txt"))) {
			for (Mouse mouse : mouses) { // fazendo o for de interação com a List dentro do BufferedWriter se utiliza a
											// porta aberta para escrever a quantidade de vezes que for necessário de
											// acordo com a quantidade de elementos da List
				escrever2.write(mouse.toString());
			}
		}

	}

}
