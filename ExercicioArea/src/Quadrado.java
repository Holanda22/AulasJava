
public class Quadrado implements AreaCalculavel{
	
	private float lado;

	@Override
	public void calcularArea() {
		System.out.println("A �rea do quadrado � " + Math.pow(lado, 2));
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	

	

}
