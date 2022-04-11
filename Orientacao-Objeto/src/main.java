
public class main {

	public static void main(String[] args) {
		
		Pessoas pessoa1 = new Pessoas(); //criação de objeto, Pessoas é referente a classe de construção e pessoa1 a varíavel de referência para o objeto criado.
		
		
		pessoa1.nome = "Rafael"; //atributos de Pessoas são públicos por isso são visíveis aqui.
		pessoa1.numFigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
	}

}
