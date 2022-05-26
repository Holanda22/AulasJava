import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException { // duas exceções, uma para caso
																						// execução dê errado por conta
																						// da porta aberta, e outra para
																						// caso o arquivo não seja
																						// encontrado

		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) { //método readLine lê a linha do arquivo até o \n, após isso lê a debaixo
				string += line + "\n";
			}

			System.out.println(string);
		}

	}

}
