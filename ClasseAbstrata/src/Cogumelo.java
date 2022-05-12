
public class Cogumelo extends Item {

	@Override
	public void pegar() { // Por ser uma subclasse de uma super abstrata, é obrigada à subscrever os
							// métodos abstratos desta
		System.out.println("Pegou cogumelo");
	}

}
