import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		String s = "texto para ser gravado no arquivo";

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))) {// try serve para testar o
																							// c?digo e caso d? erro
																							// tudo feito antes ?
																							// apagado para n?o se criar
			// arquivos corrompidos
			escrever.write(s); // o objeto escrever, tem fun??es relacionadas a escrita de String para um
								// arquivo de texto, o m?todo write ? quem realiza essa fun??o 
			escrever.newLine();
		}

		Mouse mouse1 = new Mouse(false, 2, "pequeno");
		Mouse mouse2 = new Mouse(true, 5, "grande");
		Mouse mouse3 = new Mouse(true, 3, "m?dio");

		List<Mouse> mouses = new ArrayList<Mouse>();

		mouses.add(mouse1);
		mouses.add(mouse2);
		mouses.add(mouse3);

		try (BufferedWriter escrever2 = new BufferedWriter(new FileWriter("Mouses.txt", true))) {
			for (Mouse mouse : mouses) { // fazendo o for de intera??o com a List dentro do BufferedWriter se utiliza a
											// porta aberta para escrever a quantidade de vezes que for necess?rio de
											// acordo com a quantidade de elementos da List
				escrever2.write(mouse.toString());
			}
		}
	}
}
