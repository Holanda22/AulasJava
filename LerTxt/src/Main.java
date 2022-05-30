import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException { // duas exce��es, uma para caso
																						// execu��o d� errado por conta
																						// da porta aberta, e outra para
																						// caso o arquivo n�o seja
																						// encontrado

//		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
//			String line;
//			String string = "";
//
//			while ((line = reader.readLine()) != null) { // m�todo readLine l� a linha do arquivo at� o \n, ap�s isso l�
//															// a debaixo
//				string += line + "\n";
//			}
//			System.out.println(string);
//		}
		List<Mouse> listaDeMouses = new ArrayList<Mouse>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader("Mouses.txt"))) {
			String line;

			while ((line = reader.readLine()) != null) { // m�todo readLine l� a linha do arquivo at� o \n, ap�s isso l�
															// a debaixo
				Mouse mouse = new Mouse(line);
				
				listaDeMouses.add(mouse);
			}
		}
		
		for(Mouse mouse : listaDeMouses) {
			System.out.println(mouse);
		}
		

	}

}
