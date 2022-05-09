
public class Refrigerante extends Bebida {

	public Refrigerante() { // a superclasse Bebida tem um construtor recebendo parâmetros de inicialização,
							// logo suas classes filhas também devem ter
		super("Refrigerante", false); // o comando super diz respeito aos parâmetros da superclasse
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando refrigerante no copo");
	}

}
