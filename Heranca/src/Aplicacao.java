
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2015);
		
		System.out.println();
		
		veiculo.Imprimir();
		veiculo.Buzinar();
		
		System.out.println();
		
		Carro carro1 = new Carro();
		
		carro1.setMarca("Honda");
		carro1.setModelo("Fit");
		carro1.setAno(2015);
		carro1.setQuatroPortas(true);
		
		System.out.println();
		
		carro1.Imprimir();
		carro1.Buzinar();
		
		System.out.println();
		
		Caminhao caminhao1 = new Caminhao();
		
		caminhao1.setMarca("Scania");
		caminhao1.setModelo("43VX24");
		caminhao1.setAno(2017);
		
		System.out.println();
		
		caminhao1.Imprimir();
		caminhao1.Buzinar();
		
		Moto moto1 = new Moto();
		
		moto1.setMarca("Honda");
		moto1.setModelo("Hornet");
		moto1.setAno(2013);
		
		System.out.println();
		
		moto1.Imprimir();
		moto1.Buzinar();
		moto1.Empinar();
		
		
				

	}

}
