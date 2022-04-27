
public class ContaBancaria {

	private int numConta; // o modificador private define que o atributo s� � visivel na classe a qual
							// pertence, modificadores s�o a primeira parte da sintaxe da declara��o de
							// variavel e quando n�o escrito ela � pr� definida como publica
	private boolean ativo;
	private double saldo;

	public ContaBancaria() { // construtor do objeto, com ele � poss�vel inicializar todo objeto com as
								// defini��es declaradas entre chaves
		ativo = true;
		saldo = 1;
	}

	public ContaBancaria(boolean ativo, double saldo) { // sobrecarga de construtores. O construtor com par�metros
														// permite que quem vai instanciar o objeto defina com que
														// valores o objeto iniciar�
		super();
		this.ativo = ativo;
		this.saldo = saldo;
	}

	public void receber(double valor) {
		saldo += valor;
	}

	public double saldo() {
		return saldo;
	}

	public void dar(double valor, ContaBancaria conta) {
		if (saldo >= valor) // pois s� se pode realizar saque/pagamento caso tenha esse valor na conta
			saldo -= valor;
		conta.receber(valor);

	}

}
