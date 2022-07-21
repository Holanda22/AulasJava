package fundamentos3;

public class Main {

	public static void main(String[] args) {
		
		Abastecimento abastecer = new Abastecimento();
		
		Veiculo carro = new Carro(4, 4, true, 25);
		
		carro.Andar();
		carro.Buzinar();
		
		abastecer.Abastecer(carro);
		
		System.out.println();
		
		Veiculo moto = new Moto(0, 2, false, 5);
		
		moto.Andar();
		moto.Buzinar();
		
		abastecer.Abastecer(moto);
		
		System.out.println();
		
		Caminhao caminhao = new Caminhao(4, 8, false, 148);
		
		caminhao.Andar();
		caminhao.Buzinar();
		
		abastecer.Abastecer(caminhao);
		
		

	}

}
