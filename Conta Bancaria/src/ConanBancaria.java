
public class ConanBancaria {

	private int numConta;
	private double saldo;
	private boolean ativo;

	// Construtor que define os valores iniciais dos atributos quando objeto é
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

	// Método de receber dinheiro
	public void Receber(double valor) {
		saldo += valor;

	}

	// Método de ver saldo
	public double Ver() {
		return saldo;
	}

	// Método de dar dinheiro de acordo com saldo disponível
	public void Dar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Você não tem dinheiro suficiente na conta!");
		}
	}

}
