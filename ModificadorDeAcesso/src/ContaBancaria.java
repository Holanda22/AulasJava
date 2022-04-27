
public class ContaBancaria {

	private int numConta; // o modificador private define que o atributo s� � visivel na classe a qual
							// pertence, modificadores s�o a primeira parte da sintaxe da declara��o de
							// variavel e quando n�o escrito ela � pr� definida como publica
	private boolean ativo;
	private double saldo;
	
	public void receber(double valor) { 
		saldo += valor;	
	}
	
	public double saldo() {
		return saldo;
	}
	
	public void dar(double valor) {
		if (saldo >= valor) //pois s� se pode realizar saque/pagamento caso tenha esse valor na conta
			saldo -= valor;
		
	}

}
