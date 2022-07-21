package fundamentos3;

public class Moto extends Veiculo{

	public Moto(int portas, int qntRodas, boolean eletrico, float qntAbastecido) {
		super(portas, qntRodas, eletrico, qntAbastecido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Abastecer() {
		setCapacidadeTanque(9);
	}
	@Override
	public void Andar() {
		System.out.println("Bololo");
	}

	@Override
	public void Buzinar() {
		System.out.println("Bi Bi");
	}
}
