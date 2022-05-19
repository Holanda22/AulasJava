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

//		int IdadePessoa = 19;
//
//		System.out.println("Você tem " + IdadePessoa + " anos");
//
//		if (IdadePessoa < 18) { // if serve para fazer um teste para saber se a condição entre parenteses é verdadeira ou falsa, caso
//								// seja verdadeira seu código é executado
//			System.out.println("Você não pode beber");
//		} else if (IdadePessoa < 60) { // caso seja falsa, com else if outro teste condicional é feito, caso seja
//										// verdadeiro seu código é executado
//			System.out.println("Bora tomar uma!");
//		} else { // caso nenhum dos teste condicionais feitos funcione, é executado o que está
//					// dentro de else
//			System.out.println("E a aposentadoria sai quando?");
//		}

//		int diasemana = 6;
//
//		switch (diasemana) { // usado para teste de conteúdo, diferente do if else que testa condições que
//								// podem ser completamente distintas. É útil para valores pré definidos como:
//								// dias da semana, meses do ano, estações do ano, etc
//		case 1: // case define que conteúdo a variável deve receber para executar o código após
//				// os dois pontos
//			System.out.println("Domingo");
//			break; // break faz com que o comando switch pare de rodar, sem ele todo código depois
//					// dos dois pontos é considerado do case validado
//		case 2:
//			System.out.println("Segunda-feira");
//			break;
//		case 3:
//			System.out.println("Terça-feira");
//			break;
//		case 4:
//			System.out.println("Quarta-feira");
//			break;
//		case 5:
//			System.out.println("Quinta-feira");
//			break;
//		case 6:
//			System.out.println("Sexta-feira");
//			break;
//		case 7:
//			System.out.println("Sabádo");
//			break;
//		default: // outros casos, para valores de variável que não tem um case
//			System.out.println("Esse número não representa nenhum dia da semana!");
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
//		laços de repetição

//		int x = 0;
//
//		while (x < 10) { // repete a operação enquanto a condição for verdadeira, não se sabe quantas
//							// vezes irá repetir
//			System.out.println(x);
//			x = x + 1;
//		}
//
//		x = 0;
//		do { // realiza a operação até a condição for verdadeira
//			System.out.println(x);
//			x = x + 1;
//		} while (x < 10);

		// repete código por uma quantidade de vezes já determinada, nesse caso até x
		// passar a ser maior de 11
//		System.out.println("Tabuada do 2");
//		for (int x = 0; x < 11; x++) { // dentro do for é possível criar uma variável de controle, que define quantas
//										// vezes o código será repetido e como ela vai mudar de repetição para repetição
//			System.out.println(2 + " x " + x + " = " + x * 2);
//		}
//
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite a tabuada que deseja fazer:");
//
//		int y = entrada.nextInt();
//		System.out.println("Tabuada do " + y);
//
//		for (int x = 0; x < 11; x++) {
//			System.out.println(y + " x " + x + " = " + x * y);
//		}

		// código longo para mostrar valor de três variáveis de mesmo tipo
//		int x = 5;
//		int y = 7;
//		int z = 3;
//
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println();
//
//		// Criação de array para executar a mesma função acima em menos linhas de
//		// código:
//
//		// Criação de array/matriz, que é uma única variável, com mais de um espaço.
//		// Neste criação o valores já estão sendo atribuidos, caso sejam atribuidos ao
//		// longo do programa, deve-se criar o array de outra maneira
//		int x1[] = { 5, 7, 3 }; // 1ª maneira de definir quantidade de espaços: atribuindo valores dentro de
//								// colchetes, separados por vírgula. Neste caso a quantidade de espaços é 3.
//		for (int aux = 0; aux < x1.length; aux++) { // a variável de controle "aux" serve para determinar que valor
//													// armazenado no array será utilizado a partir do indice. aux=indice
//			System.out.println(x1[aux]);
//		}
//
//		// Exemplo de array de uma variável do tipo String:
//		String nome[] = { "Beatriz", "Angelina", "Joelma", "Kauã", "Geovanna" }; // array do tipo String com 5 espaços
//
//		for (int aux = 0; aux < nome.length; aux++) {
//			System.out.println("O indice de " + nome[aux] + " é " + aux); //String para demonstrar o indice de cada valor guardado no array
//		}

		// Criação de arrays sem atribuição direta de valores, definindo seus tamanhos
		// pelo indice:
//		int[] x2 = new int[5]; // array que pode receber até 5 valores do tipo inteiro
//		String[] nome1 = new String[4]; // array que pode receber até 4 valores do tipo String
//		double[] arrayDouble = new double[10]; // array que pode receber até 10 valores do tipo double
//
//		x2[4] = 6; // atribuição do número 6 no espaço de indice 4 dentro da variável x2

//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in);
//
//		for (int x = 0; x < numero.length; x++) {
//			System.out.println("Digite um número aleatório:");
//			numero[x] = teclado.nextInt(); // atribuição de valor à variável x, para cada indice
//		}
//
//		for (int x = 0; x < numero.length; x++) {
//			System.out.println("Indice " + x + " = " + numero[x]);
//		}

		// criando um array do tipo Object, nele é possível guardar qualquer tipo de
		// valor, visto que Object é a superclasse de todas as outras classes no java
//		int[] arrayQualquer = new int[3]; // arrays precisam ser instanciados, caracteristica que indica que os espaços
//											// da matriz são construidos na memória heap e na stack estão apenas os
//											// endereços desses espaços
//		Object[] arrayObject = new Object[6];
//
//		arrayObject[0] = 12;
//		arrayObject[1] = "Beatriz";
//		arrayObject[2] = 13.8;
//		arrayObject[3] = true;
//		arrayObject[5] = arrayQualquer; // o array de tipo Object recebe qualquer valor, inclusive outro array. neste
//										// caso não foi especificado o valor de qual espaço é para ser impresso na
//										// tela, então o que é mostrado é o endereço desse array
//
//		for (int x = 0; x < arrayObject.length; x++) {
//			System.out.println("Indice " + x + " = " + arrayObject[x]);
//		}

		// Arrays Bidirecional: que possui duas direções, linhas e colunas
		// construção de Array bidirecional:
		int[][] arrayBidirecional = new int[4][3]; // o primeiro colchetes determina a quantidade de linhas e o segundo
													// a quantidade de colunas
		arrayBidirecional[0][0] = 8;// para atribuir valores neste array basta indicar o indice de em qual linha o
									// valor vai ser encontrado e o indice de em qual coluna
		arrayBidirecional[2][1] = 7;// aqui o valor 7 inteiro está localizado no espaço do array na linha 2 e na
									// coluna 1, lembrando que os indices começam em 0

		for (int linha = 0; linha < arrayBidirecional.length; linha++) { // for para contagem do primeiro indice
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { // for para contagem o segundo
																					// indice, logo quando o indice da
																					// linha for 0, o da coluna roda até
																					// atingir o maximo de colunas,
																					// assim interando a primeria linha
																					// do array e indo rodar a segunda
				System.out.print("Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " ");
			}
			System.out.println();
		}

	}

}
