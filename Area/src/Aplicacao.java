import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Area area = new Area();
		
		System.out.println("Voc� deseja calcular a �rea de qual forma?");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Ret�ngulo");
		System.out.println("3 - Tri�ngulo");
		
		int forma = scanner.nextInt();
		
		if (forma == 1) {
			
			System.out.println("Digite a altura do quadrado em cent�metros:");
			int l = scanner.nextInt();
			
			int resultado = area.calcarea(l);
			
			System.out.println("A �rea do quadrado � " + resultado + " cm." );
		}
		
		else if (forma == 2) {
			
			System.out.println("Digite a altura do ret�ngulo em cent�metros:");
			int h = scanner.nextInt();
			
			System.out.println("Digite a largura do ret�ngulo em cent�metros:");
			int l = scanner.nextInt();
			
			int resultado = area.calcarea(l, h);
			
			System.out.println("A �rea do ret�ngulo � " + resultado + " cm." );
		}
		
		else if (forma == 3) {
			
			System.out.println("Digite a altura do ret�ngulo em cent�metros:");
			double h = scanner.nextDouble();
			
			System.out.println("Digite a largura do ret�ngulo em cent�metros:");
			double l = scanner.nextDouble();
			
			double resultado = area.calcarea(l, h);
			
			System.out.println("A �rea do tri�ngulo � " + resultado + " cm." );
		}
		
		else {
			System.out.println("Forma n�o identificada");
		}
		
		

	}

}
