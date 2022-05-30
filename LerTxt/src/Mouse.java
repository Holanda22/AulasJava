public class Mouse {
	private String funciona;
	private String qtdBotoes;
	private String tamanho;

	public Mouse(String funciona, String qtdBotoes, String tamanho) {
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}

	public Mouse(String texto) { // manipula��o de string para a partir de um texto no modelo do to string
									// construir um objeto
		String[] arrayAux1 = texto.split(","); // split serve para quebrar o texto onde tem o caractere entre parenteses
												// e aspas no texto, e o arrayAux1 acomodara em cada indice um fragmento
												// do texto quebrado

		String[] arrayAux2 = arrayAux1[0].split("=");
		this.funciona = arrayAux2[1].trim(); // ap�s quebrar a String at� s� restar a palavra correspondente ao valor do
												// atributo, se ultiliza o m�todo trim para apagar os espa�os antes e
												// depois da String

		String[] arrayAux3 = arrayAux1[1].split("=");
		this.qtdBotoes = arrayAux3[1].trim();

		String[] arrayAux4 = arrayAux1[2].split("=");
		this.tamanho = arrayAux4[1].trim();
	}

	@Override
	public String toString() {
		return "Mouse: funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho + "\n";
	}
}