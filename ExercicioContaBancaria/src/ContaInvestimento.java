
public class ContaInvestimento extends ContaBancaria { // subclasse de ContaBancaria

	@Override // Implementa��o do m�todo obrigat�rio calcularSaldo de acordo com as
				// caracter�sticas pr�prias dessa classe
	public void calcularSaldo() {
		saldo += (saldo * 0.05);
		System.out.println("Saldo: R$" + saldo);

	}

}
