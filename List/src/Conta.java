
public class Conta {

	String nome;
	double valor;

	public Conta(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}

}
