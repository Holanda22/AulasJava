
public class Contador {
	private static int valor; // static serve para quando se tem métodos imutáveis em uma classe, logo não há
								// a necessidade de instância-la, então é possível acessar e usar esses métodos
								// só com o nome da classe

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
