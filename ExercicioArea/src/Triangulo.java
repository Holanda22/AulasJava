
public class Triangulo implements AreaCalculavel {
	
	private float altura;
	private float base;
	
	
	@Override
	public void calcularArea() {
		System.out.println("A área do triângulo é " + (altura*base)/2 );
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getBase() {
		return base;
	}


	public void setBase(float base) {
		this.base = base;
	}

	

}
