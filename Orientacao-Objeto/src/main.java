
public class main {

	public static void main(String[] args) {
		
		Pessoas pessoa1 = new Pessoas();
		
		pessoa1.nome = "Rafael";
		pessoa1.numFigurinhas = 1;
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
	}

}
