
public class Circunferencia implements AreaCalculavel {
	
	private float raio;

	@Override
	public void calcularArea() {
		System.out.println("A �rea da circunfer�ncia � " +  Math.PI * Math.pow(raio, 2));
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

}
