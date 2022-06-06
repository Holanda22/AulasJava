
public class ConanBancaria {

	private int numConta;
	private double saldo;
	private boolean ativo;

	// Construtor que define os valores iniciais dos atributos quando objeto �
	// criado
	public ConanBancaria() {
		numConta = 1;
		saldo = 1.0;
		ativo = true;
	}

	public ConanBancaria(boolean ativo, int numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.ativo = ativo;
	}

	// M�todo de receber dinheiro
	public void Receber(double valor) {
		saldo += valor;

	}

	// M�todo de ver saldo
	public double Ver() {
		return saldo;
	}

	// M�todo de dar dinheiro de acordo com saldo dispon�vel
	public void Dar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Voc� n�o tem dinheiro suficiente na conta!");
		}
	}

}
