
public class Pessoa {
	
	private String nome;
	private int idade;
	public enum Sexo {
		FEMININO,
		MASCULINO;
	}
	private Sexo sexo;
	private Endereco endereco;
	
		
	public void sexoNum(int sexo) {
		if(sexo == 1) {
			this.sexo=Sexo.FEMININO;
		}
		else if(sexo == 2) {
			this.sexo=Sexo.MASCULINO;
		}

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
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", endereco=" + endereco + "]";
	}

	
	
	
	
	
	
	
	
	
	

}
