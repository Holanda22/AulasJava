
public class Aplicacao {

	public static void main(String[] args) {
		// inst�ncia de uma conta corrente e uma investimento
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaInvestimento contaInvestimento = new ContaInvestimento();

		// m�todo calcularSaldo, que tem mesma assinatura, mas � diferente para cada um
		// dos casos
		contaCorrente.calcularSaldo();
		contaInvestimento.calcularSaldo();
		System.out.println();
		
		// m�todo depositar e calcular saldo, para visualizar a opera��o
		contaCorrente.depositar(100);
		contaCorrente.calcularSaldo();
		System.out.println();

		contaInvestimento.depositar(100);
		contaInvestimento.calcularSaldo();
		System.out.println();
		
		// m�todo sacar e calcular saldo
		contaInvestimento.sacar(50);
		contaInvestimento.calcularSaldo();
		System.out.println();
		
		// m�todo para transferir dinheiro de uma conta pra outra e 
		contaCorrente.transferir(contaInvestimento, 30);
		contaCorrente.calcularSaldo();
		contaInvestimento.calcularSaldo();
		System.out.println();

	}

}
