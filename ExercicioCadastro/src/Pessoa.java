
public class Pessoa { // folha com código de uma class, a qual é o manual de construção de um objeto

	private String nome; // atributos que todo objeto do tipo Pessoa deverá ter, podem ser primitivos,
							// isto é, escritos em binário, ou serem uma classe do java, como no caso da
							// variável String
	private int idade;

	private enum Sexo {
		FEMININO, MASCULINO;
	}

	private Sexo sexo;
	private Endereco endereco;

	public int sexoNum(int sexo) { // assinatura de método, onde a primeir palavra é o modificador de acesso, a
									// segunda o retorno, que define se o seu método vai te dar algo após executar
									// seu código, a terceira o nome do método e entre parênteses os parâmetros, que
									// são váriaveis que seráo usadas no código que o método executará
		if (sexo == 1) {
			this.sexo = Sexo.FEMININO;
		} else if (sexo == 2) {
			this.sexo = Sexo.MASCULINO;
		}
		return sexo;
	}

	public Sexo getSexo() { // os getters são métodos que servem para pegar um atributo sem alterar seu
							// valor
		return sexo;
	}

	public void setSexo(Sexo sexo) { // os setters servem para dar um valor à um atributo sem acessá-lo diretamente,
										// já que ele é privado
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
		this.idade = Integer.parseInt(arrayAux3[1].trim()); // parse serve para fazer casting de tipos de variáveis não
															// primárias

		String[] arrayAux4 = arrayAux1[2].split(":"); // valueOf é um método que define que seu parâmetro deve ser o
														// valor da variável que o está chamando
		this.sexo = Sexo.valueOf(arrayAux4[1]);

		Endereco endereco = new Endereco(arrayAux1[3]);
		this.endereco = endereco;

	}

	public Pessoa() {
	}

}
