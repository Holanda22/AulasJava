import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		int n1;
		int n2;
		String op = "";
		int control = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a opera��o que deseja realizar (+, -, *, /): ");
		op = entrada.nextLine();
		
		System.out.println("Digite o primeiro valor da opera��o:");
		n1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o segundo valor da opera��o:");
		n2 = Integer.parseInt(entrada.nextLine());
		
		if (op.equals("+")) {
			System.out.println("O resultado da soma �: " + (n1 + n2));
			control++;
		}
		if (op.equals("-")) {
			System.out.println("O resultado da subtra��o �: " + (n1 - n2));
			control++;
		}
		if (op.equals("*")) {
			System.out.println("O resultado da multiplica��o �: " + (n1 * n2));
			control++;
		}
		if (op.equals("/")) {
			System.out.println("O resultado da divis�o �: " + (n1 / n2));
			control++;
		}
		if (control == 0) {
			System.out.println("A opera��o digitada � invalida! Tente novamente!");
		}	
	}
}
