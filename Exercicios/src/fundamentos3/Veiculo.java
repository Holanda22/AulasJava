package fundamentos3;

public class Veiculo {

	private int portas;
	private int qntRodas;
	private boolean eletrico;
	private float capacidadeTanque;
	private float qntAbastecido;
	
	public Veiculo(int portas, int qntRodas, boolean eletrico, float qntAbastecido) {
		super();
		this.portas = portas;
		this.qntRodas = qntRodas;
		this.eletrico = eletrico;
		this.qntAbastecido = qntAbastecido;
	}

	public void Andar() {
		
	}
	
	public void Buzinar(){
	
	}
	
	public void Abastecer(){
		
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getQntRodas() {
		return qntRodas;
	}

	public void setQntRodas(int qntRodas) {
		this.qntRodas = qntRodas;
	}

	public boolean isEletrico() {
		return eletrico;
	}

	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}

	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public float getQntAbastecido() {
		return qntAbastecido;
	}

	public void setQntAbastecido(float qntAbastecido) {
		this.qntAbastecido = qntAbastecido;
	}
	
	
}
