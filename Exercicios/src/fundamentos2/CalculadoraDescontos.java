package fundamentos2;

import java.util.Scanner;

public class CalculadoraDescontos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculadora de Descontos");
		
		System.out.println("Digite o valor do produto:");
		double valor = entrada.nextDouble();
		
		System.out.println("Digite a porcentagem de desconto:");
		int porcentagem = entrada.nextInt();
		
		System.out.println("O valor a ser pago e R$" + (valor - ((valor * porcentagem) / 100)));
		

	}

}
