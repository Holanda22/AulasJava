package fundamentos;

import java.io.InputStream;
import java.util.Scanner;

import fundamentos.Funcionario.Cargo;

public class ProgramaRevisao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cadastro de funcionários");
		
		Funcionario funcionario1 = new Funcionario(); 
		
		System.out.println("Digite o nome do funcionário:");
		funcionario1.setNome(entrada.nextLine());
		
		System.out.println("Digite o número correspondente ao cargo que " + funcionario1.getNome() + " ocupa:");
		System.out.println("1 - " + Cargo.OPERADOR_DE_MAQUINAS.getNome());
		System.out.println("2 - " + Cargo.ASSISTENTE_ADMINISTRATIVO.getNome());
		System.out.println("3 - " + Cargo.GESTOR_FINANCEIRO.getNome());
		
		funcionario1.setCargo(entrada.nextInt());
		funcionario1.setSalario(funcionario1.getCargo());
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getCargo());
		System.out.println(funcionario1.getSalario());
		
		
		
		
		
		
		
		
	}
}
