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
//		a = y; n�o � poss�vel fazer essa convers�o com casting impl�cito, pois a var�avel double possui um espa�o de mem�ria maior que a int
//		a = (int) y;  com casting explic�to � poss�vel converter, pois h� a declara��o dessa convers�o que assume a resposabilidade de perda de informa��o
//		b = x;* � poss�vel fazer convers�o com casting impl�cito quando a var�avel que ir� receber informa��o tem o tamanho menor que a que est� atribuindo

// 		int IdadePessoa = 19;

//		System.out.println("Voc� tem " + IdadePessoa + " anos");

//		if (IdadePessoa < 18) {
//			System.out.println("Voc� n�o pode beber");
//		} else if (IdadePessoa < 60) {
//			System.out.println("Bora tomar uma!");
//		} else {
//			System.out.println("E a aposentadoria sai quando?");
//		}

//		int diasemana = 6;
//		
//		switch(diasemana) { 						//usado para teste de conte�do, diferente do if else que testa condi��es que podem ser completamente distintas.
//			case 1:
//				System.out.println("Domingo");
//				break;
//			case 2:
//				System.out.println("Segunda-feira");
//				break;
//			case 3:
//				System.out.println("Ter�a-feira");
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
//				System.out.println("Sab�do");
//				break;
//			default:
//				System.out.println("Esse n�mero n�o representa nenhum dia da semana!");
//			
//		}
		
//		char caractere = 'C';
//		
//		switch(caractere) {
//			case 'A':
//				System.out.println("Seu caractere � A");
//			break;
//			case 'B':
//				System.out.println("Seu caractere � B");
//			break;
//			case 'C':
//				System.out.println("Seu caractere � C");
//			break;
//			default:
//				System.out.println("Valor inv�lido");
//		}
//		la�os de repeti��o
		
//		int x = 0;
//		
//		while(x < 10) { 			//repete a opera��o enquanto a condi��o for verdadeira, n�o tem pr� defini��o de quantas vezes ir� repetir 
//			System.out.println(x);
//			x = x+1;
//		}
//		
//		x = 0;
//		do {						//realizar a opera��o at� a condi��o for verdadeira
//			System.out.println(x);
//			x = x+1;
//		} while(x < 10);
		
		System.out.println("Tabuada do 2");
		for (int x=0; x<11; x++) {	//serve para repetir opera��es em que se sabe quantas vezes ter� de repetir
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
