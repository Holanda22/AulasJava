
public abstract class ContaBancaria { // conta genérica, onde não faz sentido ter um objeto do seu tipo, já que as
										// subclasses são mais específicas e ultilizáveis

	protected double saldo = 0; // atributo com modificador de acesso protected que faz com que ele seja visível
								// para essa classe e suas subclasses apenas

	// métodos iguais para qualquer conta bancária, que são herdados por elas, mas
	// não precisam ser obrigatóriamente implementados
	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiênte!");
		}
	}

	public void transferir(ContaBancaria conta, double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			conta.depositar(valor);
		} else {
			System.out.println("Saldo insuficiênte!");
		}
	}

	// método de calculo do saldo, que é obrigatório para toda Conta Bancaria, pois
	// toda conta precisa calcular seu saldo, mas que não tem um padrão pois muda de
	// acordo com as características específicas de cada subContaBancaria, logo é um
	// método abstrato
	public abstract void calcularSaldo();

}
