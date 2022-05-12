
public class Retangulo implements AreaCalculavel {

	private float altura;
	private float largura;
	
	
	@Override
	public void calcularArea() {
		System.out.println("A área do retângulo é " + altura*largura );
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getLargura() {
		return largura;
	}


	public void setLargura(float largura) {
		this.largura = largura;
	}


	
}
