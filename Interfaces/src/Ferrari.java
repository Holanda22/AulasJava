
public class Ferrari implements Automovel, ItemCaro { // para "linkar" a classe com a interface, usa-se o comando implements, pois
											// será nessa classe que os métodos assinados na interface serão
											// implementados voltados às necessidades do futuro objeto

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");

	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");

	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");

	}

	@Override
	public double getPreco() {
		return 500000;
	}

}
