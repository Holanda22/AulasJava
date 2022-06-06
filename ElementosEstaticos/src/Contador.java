
public class Contador {
	private static int valor; // static serve para quando se tem m�todos imut�veis em uma classe, logo n�o h�
								// a necessidade de inst�ncia-la, ent�o � poss�vel acessar e usar esses m�todos
								// s� com o nome da classe

	public static void incrementar() {
		valor++;
	}
//		public Contador() {
//			this.valor = 1;
//		}

	static {
		valor = 1;
	}

	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
