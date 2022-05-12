
public class Aplicacao {

	public static void main(String[] args) {
		// Item item = new Item (); uma caracter�stica das classes abstratas � que n�o �
		// poss�vel instanci�-las, j� quelas s�o t�o gen�ricas ao ponto de serem
		// abstratas

		Item item = new Cogumelo(); // N�o � poss�vel instanciar um objeto abstrato, mas � poss�vel instanciar
									// objetos do tipo das subclasses da superclasse abstrata
		item.pegar();

		item = new Diamante();
		item.pegar();

		item = new Moeda();
		item.pegar();

	}

}
