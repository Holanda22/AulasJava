
public class main {

	public static void main(String[] args) {
		
		Pessoas pessoa1 = new Pessoas(); //cria��o de objeto, Pessoas � referente a classe de constru��o e pessoa1 a var�avel de refer�ncia para o objeto criado.
	
		pessoa1.nome = "Rafael"; //atributos de Pessoas s�o p�blicos por isso s�o vis�veis aqui.
		pessoa1.numFigurinhas = 1;
		
		System.out.println("Antes:");
		System.out.println(pessoa1.nome + " tem " + pessoa1.numFigurinhas + " figurinha(s).");
		
		
		Pessoas pessoa2 = new Pessoas();
		
		pessoa2.nome = "Laura";
		pessoa2.numFigurinhas = 3;
		
		System.out.println(pessoa2.nome + " tem " + pessoa2.numFigurinhas + " figurinha(s).");
		
		pessoa2.dar(2, pessoa1);
		
		System.out.println("Depois:");
		System.out.println(pessoa1.nome + " tem " + pessoa1.numFigurinhas + " figurinha(s).");
		System.out.println(pessoa2.nome + " tem " + pessoa2.numFigurinhas + " figurinha(s).");
		
		 
		
		
		
		
		
	}

}
