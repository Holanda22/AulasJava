import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException { //

		Scanner entrada = new Scanner(System.in);

		List<Pessoa> cadastrosLidos = new ArrayList<Pessoa>();

//		List<Pessoa> cadastros = new ArrayList<Pessoa>();

		int menu = 0;

		while (menu != 4) {
			System.out.println("Menu de Cadastro:");
			System.out.println("Digite 1 para cadastrar uma pessoa");
			System.out.println("Digite 2 para excluir um cadastro existente");
			System.out.println("Digite 3 para visualizar os cadastros feitos");
			System.out.println("Digite 4 para encerrar o programa");
			System.out.println();

			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				System.out.println("CADASTRO");
				Pessoa pessoa = new Pessoa();

				System.out.println("Digite seu nome:");
				pessoa.setNome(entrada.next());

				System.out.println("Digite sua idade:");
				pessoa.setIdade(entrada.nextInt());

				System.out.println("Digite seu sexo: 1-Feminino 2-Masculino:");
				int y = pessoa.sexoNum(entrada.nextInt());
				while (y != 1 && y != 2) {
					System.out.println("Opção não disponível!");
					System.out.println("Digite seu sexo: 1-Feminino 2-Masculino:");
					y = pessoa.sexoNum(entrada.nextInt());
				}

				pessoa.setEndereco(new Endereco());
				System.out.println("Endereço");

				System.out.println("Rua:");
				pessoa.getEndereco().setRua(entrada.next());

				System.out.println("Nº:");
				pessoa.getEndereco().setNumero(entrada.nextInt());

				System.out.println("Bairro:");
				pessoa.getEndereco().setBairro(entrada.next());

				try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Cadastros.txt", true))) {
					escrever.write(pessoa.toString() + "\n");
				}

				break;

			case 2:
				cadastrosLidos.clear();
				try (BufferedReader reader = new BufferedReader(new FileReader("Cadastros.txt"))) {
					String line = "";

					while ((line = reader.readLine()) != null) {
						Pessoa lidos = new Pessoa(line);
						cadastrosLidos.add(lidos);
					}
				}
				System.out.println("Cadastros:");
				for (int x = 0; x < cadastrosLidos.size(); x++) {
					System.out.println(x + " - " + cadastrosLidos.get(x));
				}
				
				System.out.println();
				System.out.println("Digite o indíce do cadastro que deseja excluir:");
				int excluir = entrada.nextInt();
				
				if(excluir > cadastrosLidos.size()) {
					System.out.println("Esse cadastro não existe!");
				}
				else {
					cadastrosLidos.remove(excluir);
					try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Cadastros.txt"))) {
						for (Pessoa reescrever : cadastrosLidos) {
						escrever.write(reescrever.toString() + "\n");
						}
					}
					System.out.println("Cadastro excluído com sucesso!");
				}

				break;

			case 3:
				try (BufferedReader reader = new BufferedReader(new FileReader("Cadastros.txt"))) {
					String line = "";

					cadastrosLidos.clear();

					while ((line = reader.readLine()) != null) {
						Pessoa lidos = new Pessoa(line);
						cadastrosLidos.add(lidos);
					}
				}

				System.out.println("Cadastros realizados:");

				for (Pessoa pessoas : cadastrosLidos) {
					System.out.println(pessoas);
				}
			}
		}
	}

}
