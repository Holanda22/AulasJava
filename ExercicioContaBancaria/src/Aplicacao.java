
public class Aplicacao {

	public static void main(String[] args) {
		// instância de uma conta corrente e uma investimento
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaInvestimento contaInvestimento = new ContaInvestimento();

		// método calcularSaldo, que tem mesma assinatura, mas é diferente para cada um
		// dos casos
		contaCorrente.calcularSaldo();
		contaInvestimento.calcularSaldo();
		System.out.println();
		
		// método depositar e calcular saldo, para visualizar a operação
		contaCorrente.depositar(100);
		contaCorrente.calcularSaldo();
		System.out.println();

		contaInvestimento.depositar(100);
		contaInvestimento.calcularSaldo();
		System.out.println();
		
		// método sacar e calcular saldo
		contaInvestimento.sacar(50);
		contaInvestimento.calcularSaldo();
		System.out.println();
		
		// método para transferir dinheiro de uma conta pra outra e 
		contaCorrente.transferir(contaInvestimento, 30);
		contaCorrente.calcularSaldo();
		contaInvestimento.calcularSaldo();
		System.out.println();

	}

}
