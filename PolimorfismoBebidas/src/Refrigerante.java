
public class Refrigerante extends Bebida {

	public Refrigerante() { // a superclasse Bebida tem um construtor recebendo par�metros de inicializa��o,
							// logo suas classes filhas tamb�m devem ter
		super("Refrigerante", false); // o comando super diz respeito aos par�metros da superclasse
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando refrigerante no copo");
	}

}
