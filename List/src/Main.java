import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List lista = new ArrayList(); // a interface list tem função semelhante aos arrays, guardar mais de um valor
										// na mesma variável, sua particularidade é que os metódos dela implementados
										// permitem que ela se redimencione de acordo com o que for atribuido ao
										// longo do programa, diferente do array que uma vez atribuido seu tamanho, não
										// pode-se mudar. A classe que implementa List usada é a ArrayList e ambas são
										// do java e estão uma biblioteca na JRE, logo devem ser importadas para serem
										// usadas

		lista.add("abc"); // o método add de List, implementado por ArrayList, que recebe como parâmetro
							// um valor do tipo Object, ou seja qualquer valor, tem como função adicionar
							// novos valores à sua lista e consequentemente redimensionando ela, aumentando
							// seu tamanho para comportar os novos valores
		lista.add(12);
		lista.add(true);

//		for (int x = 0; x < lista.size(); x++) { // List é uma interface, logo não possui o atributo length como os
//													// objetos de tipo array, então para determinação de quando o for
//													// deve parar de rodar de acordo com seu tamanho, usa-se o método
//													// size, que informa justamente qual tamanho atual da lista, até a
//													// determinada situação do programa
//			System.out.println(lista.get(x)); // para capturar o valor usa-se o método get, que nesse caso de List
//												// recebe como parâmetro o indice de qual informação será capturada
//		}
		for (Object valor : lista) { // tipo de for usado para List e arrays unidimencionais, que com o ":" faz-se
										// todo processo do for acima e o guarda em uma variável, como na lista List
			System.out.println(valor);
		}

		System.out.println();

		lista.remove(0);
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.add(0, "def");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.set(0, "ghi");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.clear();
		if (lista.isEmpty()) {
			System.out.println("Sua lista está vazia!");
		}

		Conta conta1 = new Conta("Luz", 100);
		Conta conta2 = new Conta("Água", 80.65);

		List<Conta> listaDeContas = new ArrayList<Conta>();

		listaDeContas.add(conta1);
		listaDeContas.add(conta2);

		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}

	}

}
