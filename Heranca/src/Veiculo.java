
public class Veiculo {

	private String nome; // encapsulamento de classe
	protected String marca; // para encapsular superclasses fazendo com que suas subclasses tenham acesso
							// aos seus atributos, usa-se o modificador de acesso protected
	protected String modelo;
	protected int ano;

	public void Buzinar() {
		System.out.println("BI BI");
	}

	public void Imprimir() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
