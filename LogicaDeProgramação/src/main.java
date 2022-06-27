import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
//		System.out.println("Digite a temperatura em graus Celsius:");
//		double C = entrada.nextInt();
//		
//		double F, K, Re, Ra;
//		F = C*1.8 + 32;
//		K = C+273.15;
//		Re = C*0.8;
//		Ra = C + 1.8 + 32 + 459.67;
//		
//		System.out.println("Temperatura nas escalas:");
//		System.out.println("Fahrenheit: " + F);
//		System.out.println("Réaumur: " + Re);
//		System.out.println("Kelvin: " + K);
//		System.out.println("Rankine: " + Ra);
//		
		
		System.out.println("Digite os minutos:");
		
		int min = entrada.nextInt();
		
		int anos = min / 525600;
		int dias = (min%525600)/1440;
		
		System.out.println(min + " minutos são aproximadamente " + anos + " ano(s) e " + dias + "dia(s).");
		
		

	}

}
