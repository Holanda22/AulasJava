
public class ContaInvestimento extends ContaBancaria { // subclasse de ContaBancaria

	@Override // Implementação do método obrigatório calcularSaldo de acordo com as
				// características próprias dessa classe
	public void calcularSaldo() {
		saldo += (saldo * 0.05);
		System.out.println("Saldo: R$" + saldo);

	}

}
