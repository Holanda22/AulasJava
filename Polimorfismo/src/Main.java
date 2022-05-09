
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

	public static void falar(Animal a) { // m�todo gen�rico para que independente da classe filha entregue como
											// par�metro, o m�todo falar seja chamado uma �nica vez, j� que ele �
											// herdado por qualquer uma e apenas sofre altera��es nas classes filhas
		a.Falar(); // chamada do m�todo falar da superclasse Animal com a vari�vel "a", a qual
					// definir� que altera��o o m�todo ir� sofrer de acordo com que objeto do tipo
					// Animal foi entregue

		if (a instanceof Cachorro) { // valida��o com operador instanceof para saber se a inst�ncia entregue para
										// vari�vel "a" de tipo Animal � do tipo Cachorro
			Cachorro c = (Cachorro) a; // casting expl�cito para fazer com que a vari�vel "a" de tipo Animal seja atribu�da �
										// var�avel "c" de tipo Cachorro, possibilitanto nesse caso que quando o m�todo
										// gen�rico falar for chamado, caso o animal entregue seja Cachorro, ele al�m de
										// Falar, tamb�m Morda
			c.Morder();
		}
	}

}
