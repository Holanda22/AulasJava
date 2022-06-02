
public class Pessoa {

	private String nome;
	private int idade;

	private enum Sexo {
		FEMININO, MASCULINO;
	}

	private Sexo sexo;
	private Endereco endereco;

	public int sexoNum(int sexo) {
		if (sexo == 1) {
			this.sexo = Sexo.FEMININO;
		} else if (sexo == 2) {
			this.sexo = Sexo.MASCULINO;
		}
		return sexo;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + ", idade:" + idade + ", sexo:" + sexo + ", " + endereco;
	}

	public Pessoa(String pessoa) {

		String[] arrayAux1 = pessoa.split(",");

		String[] arrayAux2 = arrayAux1[0].split(":");
		this.nome = arrayAux2[1].trim();

		String[] arrayAux3 = arrayAux1[1].split(":");
		this.idade = Integer.parseInt(arrayAux3[1].trim());

		String[] arrayAux4 = arrayAux1[2].split(":");
		this.sexo = Sexo.valueOf(arrayAux4[1]);

		Endereco endereco = new Endereco(arrayAux1[3]);
		this.endereco = endereco;

	}

	public Pessoa() {
	}

}
