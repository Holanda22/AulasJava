//import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args)  { //throws IOException
		
		Scanner entrada = new Scanner(System.in);
		
		List <Pessoa> cadastro = new ArrayList<Pessoa>();
		
		for(int x = 0; x < 4; x++) {
			Pessoa pessoa = new Pessoa();
			System.out.println("Digite seu nome:");
			pessoa.setNome(entrada.next());
			System.out.println("Digite sua idade:");
			pessoa.setIdade(entrada.nextInt());
			System.out.println("Digite seu sexo: 1-Feminino 2-Masculino:");
			pessoa.sexoNum(entrada.nextInt());
			pessoa.setEndereco(new Endereco());
			System.out.println("Endereço");
			System.out.println("Rua:");
			pessoa.getEndereco().setRua(entrada.next());
			System.out.println("Nº:");
			pessoa.getEndereco().setNumero(entrada.nextInt());
			System.out.println("Bairro:");
			pessoa.getEndereco().setBairro(entrada.next());
			cadastro.add(pessoa);
		}
		
//		for(Pessoa cadastros : cadastro) {
//			System.out.println(cadastros);
//			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Saida.txt"))){
//			}
//		}

	}

}
