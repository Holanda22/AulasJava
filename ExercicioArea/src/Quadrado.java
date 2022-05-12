
public class Quadrado implements AreaCalculavel{
	
	private float lado;

	@Override
	public void calcularArea() {
		System.out.println("A área do quadrado é " + Math.pow(lado, 2));
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	

	

}
