
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
			return "Lâmpada ligada";	
		
		else 
			return "Lâmpada desligada";	
		
	}
	
	
	

}
