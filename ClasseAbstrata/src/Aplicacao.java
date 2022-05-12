
public class Aplicacao {

	public static void main(String[] args) {
		// Item item = new Item (); uma característica das classes abstratas é que não é
		// possível instanciá-las, já quelas são tão genéricas ao ponto de serem
		// abstratas

		Item item = new Cogumelo(); // Não é possível instanciar um objeto abstrato, mas é possível instanciar
									// objetos do tipo das subclasses da superclasse abstrata
		item.pegar();

		item = new Diamante();
		item.pegar();

		item = new Moeda();
		item.pegar();

	}

}
