
public class Pessoa { // folha com c�digo de uma class, a qual � o manual de constru��o de um objeto

	private String nome; // atributos que todo objeto do tipo Pessoa dever� ter, podem ser primitivos,
							// isto �, escritos em bin�rio, ou serem uma classe do java, como no caso da
							// vari�vel String
	private int idade;

	private enum Sexo {
		FEMININO, MASCULINO;
	}

	private Sexo sexo;
	private Endereco endereco;

	public int sexoNum(int sexo) { // assinatura de m�todo, onde a primeir palavra � o modificador de acesso, a
									// segunda o retorno, que define se o seu m�todo vai te dar algo ap�s executar
									// seu c�digo, a terceira o nome do m�todo e entre par�nteses os par�metros, que
									// s�o v�riaveis que ser�o usadas no c�digo que o m�todo executar�
		if (sexo == 1) {
			this.sexo = Sexo.FEMININO;
		} else if (sexo == 2) {
			this.sexo = Sexo.MASCULINO;
		}
		return sexo;
	}

	public Sexo getSexo() { // os getters s�o m�todos que servem para pegar um atributo sem alterar seu
							// valor
		return sexo;
	}

	public void setSexo(Sexo sexo) { // os setters servem para dar um valor � um atributo sem acess�-lo diretamente,
										// j� que ele � privado
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
		this.idade = Integer.parseInt(arrayAux3[1].trim()); // parse serve para fazer casting de tipos de vari�veis n�o
															// prim�rias

		String[] arrayAux4 = arrayAux1[2].split(":"); // valueOf � um m�todo que define que seu par�metro deve ser o
														// valor da vari�vel que o est� chamando
		this.sexo = Sexo.valueOf(arrayAux4[1]);

		Endereco endereco = new Endereco(arrayAux1[3]);
		this.endereco = endereco;

	}

	public Pessoa() {
	}

}
