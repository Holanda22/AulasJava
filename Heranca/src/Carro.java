
public class Carro extends Veiculo {
	
	private boolean quatroPortas;

	@Override
	public void Imprimir() {
		super.Imprimir();
		System.out.println("Tem 4 portas: " + quatroPortas);
		
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
	

}
