
public enum FormaPag {

	A_VISTA(-0.1),
	CARNE(0.1),
	CARTAO_CREDITO(0.05);
	
	private double juros;

	private FormaPag(double juros) {
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}
	
	
}
