
public class Lampada {
	private boolean ligada;

	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void Ligar() {
		ligada = true;
	}
	
	public void Desligar() {
		ligada = false;
	}
	
	public String Imprimir() {
		
		if (this.ligada) 
			return "L�mpada ligada";	
		
		else 
			return "L�mpada desligada";	
		
	}
	
	
	

}
