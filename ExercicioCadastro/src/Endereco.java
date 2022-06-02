
public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Endereco() {
	}
	public Endereco(String texto) {
		String[] arrayAux1 = texto.split("-");
		
		String[] arrayAux2 = arrayAux1[0].split(":");
		this.rua = arrayAux2[1].trim();
		
		String[] arrayAux3= arrayAux1[1].split(":");
		this.numero = Integer.parseInt(arrayAux3[1].trim());
		
		String[] arrayAux4 = arrayAux1[2].split(":");
		this.bairro = arrayAux4[1].trim();
	}
	@Override
	public String toString() {
		return "Rua:" + rua + " - nº:" + numero + " - bairro:" + bairro;
	}
	
		
	
	

	
	
	
	
	
	

}
