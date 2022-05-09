
public class Bebida {
	private String nome;
	private boolean aquecer;

	public Bebida(String nome, boolean aquecer) {
		this.nome = nome;
		this.aquecer = aquecer;
	}

	public void preparar() {// quando não há uma ação em comum para todas as classes filhas de uma
							// superclasse dentro de um há um passo método vazio para estabelecer que toda
							// bebida deve ser preparada
		System.out.println("Pegando copo");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}

}
