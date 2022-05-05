
public class Contador {
	private static int valor;
	
	public static void incrementar() {
		valor ++;
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
