
public class Main {

	public static void main(String[] args) {
		Lampada lampada = new Lampada(true);
		
		lampada.Desligar();
		
		System.out.println(lampada.Imprimir());
		
		lampada.Ligar();
		
		System.out.println(lampada.Imprimir());
		
		lampada.Desligar();
		lampada.Ligar();
		
		System.out.println(lampada.Imprimir());
		
		

	}

}
