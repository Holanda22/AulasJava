
public class main {

	public static void main(String[] args) {
		
		Pessoas pessoa1 = new Pessoas(); //cria��o de objeto, Pessoas � referente a classe de constru��o e pessoa1 a var�avel de refer�ncia para o objeto criado.
		
		
		pessoa1.nome = "Rafael"; //atributos de Pessoas s�o p�blicos por isso s�o vis�veis aqui.
		pessoa1.numFigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
	}

}
