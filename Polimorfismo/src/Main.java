
public class Main {

	public static void main(String[] args) {

//		Animal animal = new Cachorro();
//		animal.Falar();
//		
//		animal = new Gato();
//		animal.Falar();

		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		falar(gato);
		falar(cachorro);

	}

	public static void falar(Animal a) { // método genérico para que independente da classe filha entregue como
											// parâmetro, o método falar seja chamado uma única vez, já que ele é
											// herdado por qualquer uma e apenas sofre alterações nas classes filhas
		a.Falar(); // chamada do método falar da superclasse Animal com a variável "a", a qual
					// definirá que alteração o método irá sofrer de acordo com que objeto do tipo
					// Animal foi entregue

		if (a instanceof Cachorro) { // validação com operador instanceof para saber se a instância entregue para
										// variável "a" de tipo Animal é do tipo Cachorro
			Cachorro c = (Cachorro) a; // casting explícito para fazer com que a variável "a" de tipo Animal seja atribuída à
										// varíavel "c" de tipo Cachorro, possibilitanto nesse caso que quando o método
										// genérico falar for chamado, caso o animal entregue seja Cachorro, ele além de
										// Falar, também Morda
			c.Morder();
		}
	}

}
