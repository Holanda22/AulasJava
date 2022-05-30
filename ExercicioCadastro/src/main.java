import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args)  throws IOException { //
		
		Scanner entrada = new Scanner(System.in);
		
		List<Pessoa> cadastrosLidos = new ArrayList<Pessoa>();
		
		List <Pessoa> cadastros = new ArrayList<Pessoa>();
	
		for(int x = 0; x < 4; x++) {
			Pessoa pessoa = new Pessoa();
			System.out.println("Digite seu nome:");
			pessoa.setNome(entrada.next());
			System.out.println("Digite sua idade:");
			pessoa.setIdade(entrada.next());
			System.out.println("Digite seu sexo: 1-Feminino 2-Masculino:");
			pessoa.sexoNum(entrada.nextInt());
			pessoa.setEndereco(new Endereco());
			System.out.println("Endereço");
			System.out.println("Rua:");
			pessoa.getEndereco().setRua(entrada.next());
			System.out.println("Nº:");
			pessoa.getEndereco().setNumero(entrada.next());
			System.out.println("Bairro:");
			pessoa.getEndereco().setBairro(entrada.next());
			cadastros.add(pessoa);
		}
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Cadastros.txt", true))){
			for(Pessoa pessoa : cadastros) {
				escrever.write(pessoa.toString() + "\n");
			}
		}
		
		try (BufferedReader reader = new BufferedReader(new FileReader("Cadastros.txt"))){
			String line = "";
			
		
			while((line = reader.readLine()) != null){
				Pessoa pessoa = new Pessoa(line);
				cadastrosLidos.add(pessoa);
			}
		}
		
		for(Pessoa pessoa : cadastrosLidos) {
			System.out.println(pessoa);
		}
		
		

		
	}

}
