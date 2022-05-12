
public class Main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		quadrado.calcularArea();
		
		System.out.println();
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(2);
		triangulo.setBase(2);
		triangulo.calcularArea();
		
		System.out.println();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(8);
		retangulo.setLargura(5);
		retangulo.calcularArea();
		
		System.out.println();
		
		Circunferencia circulo = new Circunferencia();
		circulo.setRaio(5);
		circulo.calcularArea();
	}

}
