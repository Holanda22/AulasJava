public enum DiaDaSemana {// tipo de "classe" que cria valores contantes, isto é, que não mudam e
							// representa um tipo de variável personalizada
	DOMINGO(1), // a declaração de constante no enum já é a instância do objeto, logo o
				// construtor deve estar já preenchido com os valores, visto que eles devem ser
				// contantes 
	SEGUNDA(2), 
	TERCA(3), 
	QUARTA(4), 
	QUINTA(5), 
	SEXTA(6), 
	SABADO(7);

	private int num;

	private DiaDaSemana(int num) {//criação de construtor para atribuição de valores
		this.num = num;
	}

	public int getNum() {//método para capturar valor da variável num
		return num;
	}

}
