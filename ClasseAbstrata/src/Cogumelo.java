
public class Cogumelo extends Item {// para determinar que uma classe � subclasse de uma abstrata, � necess�rio
									// extend�-la da classe abstrata

	@Override
	public void pegar() { // Por ser uma subclasse de uma super abstrata, � obrigada � subscrever os
							// m�todos abstratos desta
		System.out.println("Pegou cogumelo");
	}

}
