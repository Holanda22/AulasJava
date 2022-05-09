
public class Preparador { // método genérico capaz de ser executado com qualquer objeto do tipo Bebida

	public void prepararBebida(Bebida bebida) {

		System.out.println("Preparando " + bebida.getNome());
		
		bebida.preparar();

		if (bebida.isAquecer()) { 
			System.out.println("Aquecendo " + bebida.getNome());
		}

		System.out.println("Bebida preparada com sucesso!!");
		System.out.println("");

	}

}
