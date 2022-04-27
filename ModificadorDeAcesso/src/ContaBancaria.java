
public class ContaBancaria {

	private int numConta; // o modificador private define que o atributo só é visivel na classe a qual
							// pertence, modificadores são a primeira parte da sintaxe da declaração de
							// variavel e quando não escrito ela é pré definida como publica
	private boolean ativo;
	private double saldo;
	
	public void receber(double valor) { 
		saldo += valor;	
	}
	
	public double saldo() {
		return saldo;
	}
	
	public void dar(double valor) {
		if (saldo >= valor) //pois só se pode realizar saque/pagamento caso tenha esse valor na conta
			saldo -= valor;
		
	}

}
