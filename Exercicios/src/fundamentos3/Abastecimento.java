package fundamentos3;

public class Abastecimento {
	
	public void Abastecer(Veiculo veiculo){
		
		veiculo.Abastecer();
		
		System.out.println("Foram abastecidos " + (veiculo.getCapacidadeTanque() - veiculo.getQntAbastecido()) + " litros."); 
	}
}
