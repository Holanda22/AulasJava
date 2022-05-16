
public abstract class ContaBancaria { // conta gen�rica, onde n�o faz sentido ter um objeto do seu tipo, j� que as
										// subclasses s�o mais espec�ficas e ultiliz�veis

	protected double saldo = 0; // atributo com modificador de acesso protected que faz com que ele seja vis�vel
								// para essa classe e suas subclasses apenas

	// m�todos iguais para qualquer conta banc�ria, que s�o herdados por elas, mas
	// n�o precisam ser obrigat�riamente implementados
	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insufici�nte!");
		}
	}

	public void transferir(ContaBancaria conta, double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			conta.depositar(valor);
		} else {
			System.out.println("Saldo insufici�nte!");
		}
	}

	// m�todo de calculo do saldo, que � obrigat�rio para toda Conta Bancaria, pois
	// toda conta precisa calcular seu saldo, mas que n�o tem um padr�o pois muda de
	// acordo com as caracter�sticas espec�ficas de cada subContaBancaria, logo � um
	// m�todo abstrato
	public abstract void calcularSaldo();

}
