
public class Cogumelo extends Item {// para determinar que uma classe é subclasse de uma abstrata, é necessário
									// extendê-la da classe abstrata

	@Override
	public void pegar() { // Por ser uma subclasse de uma super abstrata, é obrigada à subscrever os
							// métodos abstratos desta
		System.out.println("Pegou cogumelo");
	}

}
