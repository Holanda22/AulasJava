import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		int x = 100;
//		double y = 200;
//
//		int a = 0;
//		double b = 0;
//
//		short z = (short) 32768;
//
//		a = y; não é possível fazer essa conversão com casting implícito, pois a varíavel double possui um espaço de memória maior que a int
//		a = (int) y;  com casting explicíto é possível converter, pois há a declaração dessa conversão que assume a resposabilidade de perda de informação
//		b = x;* é possível fazer conversão com casting implícito quando a varíavel que irá receber informação tem o tamanho menor que a que está atribuindo

// 		int IdadePessoa = 19;

//		System.out.println("Você tem " + IdadePessoa + " anos");

//		if (IdadePessoa < 18) {
//			System.out.println("Você não pode beber");
//		} else if (IdadePessoa < 60) {
//			System.out.println("Bora tomar uma!");
//		} else {
//			System.out.println("E a aposentadoria sai quando?");
//		}

//		int diasemana = 6;
//		
//		switch(diasemana) {
//			case 1:
//				System.out.println("Domingo");
//				break;
//			case 2:
//				System.out.println("Segunda-feira");
//				break;
//			case 3:
//				System.out.println("Terça-feira");
//				break;
//			case 4:
//				System.out.println("Quarta-feira");
//				break;
//			case 5:
//				System.out.println("Quinta-feira");
//				break;
//			case 6:
//				System.out.println("Sexta-feira");
//				break;
//			case 7:
//				System.out.println("Sabádo");
//				break;
//			default:
//				System.out.println("Esse número não representa nenhum dia da semana!");
//			
//		}
		
//		char caractere = 'C';
//		
//		switch(caractere) {
//			case 'A':
//				System.out.println("Seu caractere é A");
//			break;
//			case 'B':
//				System.out.println("Seu caractere é B");
//			break;
//			case 'C':
//				System.out.println("Seu caractere é C");
//			break;
//			default:
//				System.out.println("Valor inválido");
//		}
		
//		int x = 0;
//		
//		while(x < 10) {
//			System.out.println(x);
//			x = x+1;
//		}
//		
//		x = 0;
//		do {
//			System.out.println(x);
//			x = x+1;
//		} while(x < 10);
		
		System.out.println("Tabuada do 2");
		for (int x=0; x<11; x++) {
			System.out.println(2 + " x " + x + " = " + x*2);
		}
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a tabuada que deseja fazer:");
		
		int y = entrada.nextInt();
		System.out.println("Tabuada do " + y);
		
		for (int x=0; x<11; x++) {
			System.out.println(y + " x " + x + " = " + x*y);
		}
		
	
		
		
		
		

	}

}
