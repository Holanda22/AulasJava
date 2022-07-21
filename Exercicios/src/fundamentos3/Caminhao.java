package fundamentos3;

public class Caminhao extends Veiculo{

	public Caminhao(int portas, int qntRodas, boolean eletrico, float qntAbastecido) {
		super(portas, qntRodas, eletrico, qntAbastecido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Abastecer() {
		setCapacidadeTanque(300);
	}
	@Override
	public void Andar() {
		System.out.println("VRUMM");
	}

	@Override
	public void Buzinar() {
		System.out.println("BIIIII");
	}
}
