package fundamentos3;

public class Carro extends Veiculo{

	public Carro(int portas, int qntRodas, boolean eletrico, float qntAbastecido) {
		super(portas, qntRodas, eletrico, qntAbastecido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Abastecer() {
		setCapacidadeTanque(70);
	}

	@Override
	public void Andar() {
		System.out.println("Vrum Vrum");
	}

	@Override
	public void Buzinar() {
		System.out.println("Fom fom");
	}
	
	
	
	
	
}
