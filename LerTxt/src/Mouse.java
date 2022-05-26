public class Mouse {
	private String funciona;
	private String qtdBotoes;
	private String tamanho;

	public Mouse(String funciona, String qtdBotoes, String tamanho) {
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}
	
	public Mouse(String texto) {
		String[] arrayAux1 = texto.split(",");
		
		String[] arrayAux2 = arrayAux1[0].split("=");
		this.funciona = arrayAux2[1].trim();
		
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