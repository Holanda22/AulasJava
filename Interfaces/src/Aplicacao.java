
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
//		Automovel automovel = new Ferrari(); // em ambos c�digos, h� o uso de polimorfismo, mas aqui, por usar a mesma
//												// var�avel de tipo automovel isso � mais vis�vel
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
