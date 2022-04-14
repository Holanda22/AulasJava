
public class Pessoas {
	String nome;
	int numFigurinhas;

	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;

	}

	boolean dar(int numFigurinhas, Pessoas pessoa) {
		
		//boolean retorno;

		if (numFigurinhas < this.numFigurinhas) {
			this.numFigurinhas -= numFigurinhas;
			pessoa.receber(numFigurinhas);
			return true;
			//retorno = true;
			//System.out.println(this.nome + " deu " + numFigurinhas + " figurinha(s) para " + pessoa.nome
					//+ " e agora " + this.nome + " tem " + this.numFigurinhas + " figurinha(s) e " + pessoa.nome 
					//+ " " + pessoa.numFigurinhas + " figurinha(s).")

		} 
		else {
			System.out.println("Quantidade de figurinhas insuficiênte para realizar esse processo");
			return false;
			//retorno = false;
			//System.out.println(this.nome + " quer dar " + numFigurinhas + " figurinha(s) para " + pessoa.nome
					//+ ", mas não pode pois só tem " + this.numFigurinhas + ".");
		}
		
		//return retorno;
	}
}