
public class Cogumelo extends Item {

	@Override
	public void pegar() { // Por ser uma subclasse de uma super abstrata, � obrigada � subscrever os
							// m�todos abstratos desta
		System.out.println("Pegou cogumelo");
	}

}
