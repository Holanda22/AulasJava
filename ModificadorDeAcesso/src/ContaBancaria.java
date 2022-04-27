
public class ContaBancaria {

	private int numConta; // o modificador private define que o atributo só é visivel na classe a qual
							// pertence, modificadores são a primeira parte da sintaxe da declaração de
							// variavel e quando não escrito ela é pré definida como publica
	private boolean ativo;
	private double saldo;

	public ContaBancaria() { // construtor do objeto, com ele é possível inicializar todo objeto com as
								// definições declaradas entre chaves
		ativo = true;
		saldo = 1;
	}

	public ContaBancaria(boolean ativo, double saldo) { // sobrecarga de construtores. O construtor com parâmetros
														// permite que quem vai instanciar o objeto defina com que
														// valores o objeto iniciará
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
		if (saldo >= valor) // pois só se pode realizar saque/pagamento caso tenha esse valor na conta
			saldo -= valor;
		conta.receber(valor);

	}

}
