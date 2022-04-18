import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Area area = new Area();
		
		System.out.println("Você deseja calcular a área de qual forma?");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Triângulo");
		
		int forma = scanner.nextInt();
		
		if (forma == 1) {
			
			System.out.println("Digite a altura do quadrado em centímetros:");
			int l = scanner.nextInt();
			
			int resultado = area.calcarea(l);
			
			System.out.println("A área do quadrado é " + resultado + " cm." );
		}
		
		else if (forma == 2) {
			
			System.out.println("Digite a altura do retângulo em centímetros:");
			int h = scanner.nextInt();
			
			System.out.println("Digite a largura do retângulo em centímetros:");
			int l = scanner.nextInt();
			
			int resultado = area.calcarea(l, h);
			
			System.out.println("A área do retângulo é " + resultado + " cm." );
		}
		
		else if (forma == 3) {
			
			System.out.println("Digite a altura do retângulo em centímetros:");
			double h = scanner.nextDouble();
			
			System.out.println("Digite a largura do retângulo em centímetros:");
			double l = scanner.nextDouble();
			
			double resultado = area.calcarea(l, h);
			
			System.out.println("A área do triângulo é " + resultado + " cm." );
		}
		
		else {
			System.out.println("Forma não identificada");
		}
		
		

	}

}
