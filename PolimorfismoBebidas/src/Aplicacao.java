
public class Aplicacao {

	public static void main(String[] args) {

		Preparador preparador = new Preparador(); // por ser uma classe de passagem, não é necessário instanciar mais de
													// um objeto, pois ele tem o mesmo comportamento independente disso

		LeiteQuente leitequente = new LeiteQuente();
		preparador.prepararBebida(leitequente);

		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);

//		Bebida bebida = new LeiteQuente();
//		preparador.prepararBebida(bebida);
//		
//		bebida = new Refrigerante();
//		preparador.prepararBebida(bebida);

	}

}
