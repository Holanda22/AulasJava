
public class Main {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(true, 3);
		ContaBancaria conta2 = new ContaBancaria();
		

//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50; //outras classes n�o deveriam poder acessar o atributo saldo, pois isso da liberdade de altera��o dele que n�o deveria dar

//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);

		conta2.receber(100.50); // como o m�todo � publico � poss�vel o acessar de outras classes

		System.out.println("R$" + conta1.saldo()); // o m�todo saldo serve apenas para mostrar o saldo da conta, por
													// isso pode ser chamado dentro do syso
		System.out.println("R$" + conta2.saldo());
		
		
		
		

		
		
		
		

	}

}
