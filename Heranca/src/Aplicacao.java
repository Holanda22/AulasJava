
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2015);
		
		veiculo.Imprimir();
		veiculo.buzinar();
		
		Carro carro1 = new Carro();
		
		carro1.setMarca("Honda");
		carro1.setModelo("City");
		carro1.setAno(2015);
		carro1.setQuatroPortas(true);
		
		carro1.Imprimir();
		carro1.buzinar();
		
				

	}

}
