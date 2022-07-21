package fundamentos;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fundamentos.Funcionario.Cargo;

public class ProgramaRevisao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		System.out.println("Cadastro de funcionários");

		for (int x = 0; x < 2; x++) {
			Funcionario funcionario = new Funcionario();

			System.out.println("Digite o nome do funcionário:");
			funcionario.setNome(entrada.next());

			System.out.println("Digite o número correspondente ao cargo que " + funcionario.getNome() + " ocupa:");
			System.out.println("1 - " + Cargo.OPERADOR_DE_MAQUINAS.getNome());
			System.out.println("2 - " + Cargo.ASSISTENTE_ADMINISTRATIVO.getNome());
			System.out.println("3 - " + Cargo.GESTOR_FINANCEIRO.getNome());

			funcionario.setCargo(entrada.nextInt());
			funcionario.setSalario(funcionario.getCargo());

			funcionarios.add(funcionario);
		}

		for (Funcionario funcionario : funcionarios) {

			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Cargo: " + funcionario.getCargo().getNome());
			System.out.println("Salário: R$" + funcionario.getSalario());
			System.out.println("---------------------------------------------");

		}

		if (funcionarios.get(0).getSalario() > funcionarios.get(1).getSalario()) {

			System.out.println(funcionarios.get(0).getNome() + " recebe R$" + (funcionarios.get(0).getSalario()
					- funcionarios.get(1).getSalario()) + " a mais que " + funcionarios.get(1).getNome());

		}
		else {
			
			System.out.println(funcionarios.get(1).getNome() + " recebe R$" + (funcionarios.get(1).getSalario()
					- funcionarios.get(0).getSalario()) + " a mais que " + funcionarios.get(0).getNome());
		}

	}
}
