
public class Aplicacao {

	public static void main(String[] args) {

//		Rota rota = new Rota();
//		Ferrari ferrari = new Ferrari();
//		Fusca fusca = new Fusca();
//		rota.ir(ferrari);
//		System.out.println();
//		rota.ir(fusca);
//		
//
//		Automovel automovel = new Ferrari(); // em ambos códigos, há o uso de polimorfismo, mas aqui, por usar a mesma
//												// varíavel de tipo automovel isso é mais visível
//		rota.ir(automovel);
//		automovel = new Fusca();
//		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apto = new Apartamento();
		Ferrari ferrari = new Ferrari();
		
		vendedor.mostrarPreco(apto);
		vendedor.mostrarPreco(ferrari);
		
		
		
		
		

	}

}
