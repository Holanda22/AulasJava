
public class Circunferencia implements AreaCalculavel {
	
	private float raio;

	@Override
	public void calcularArea() {
		System.out.println("A área da circunferência é " +  Math.PI * Math.pow(raio, 2));
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

}
