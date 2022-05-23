public enum DiaDaSemana {// tipo de "classe" que cria valores contantes, isto �, que n�o mudam e
							// representa um tipo de vari�vel personalizada
	DOMINGO(1), // a declara��o de constante no enum j� � a inst�ncia do objeto, logo o
				// construtor deve estar j� preenchido com os valores, visto que eles devem ser
				// contantes 
	SEGUNDA(2), 
	TERCA(3), 
	QUARTA(4), 
	QUINTA(5), 
	SEXTA(6), 
	SABADO(7);

	private int num;

	private DiaDaSemana(int num) {//cria��o de construtor para atribui��o de valores
		this.num = num;
	}

	public int getNum() {//m�todo para capturar valor da vari�vel num
		return num;
	}

}
