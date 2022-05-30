
public class Pessoa {
	
	private String nome;
	private String idade;
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
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
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
		return "Nome:" + nome + ", idade:" + idade + ", sexo:" + sexo + "," + endereco;
	}
	public Pessoa(String pessoa) {
		
		String[] arrayAux1 = pessoa.split(",");
		
		String[] arrayAux2 = arrayAux1[0].split(":");
		this.nome = arrayAux2[1].trim();
		
		String[] arrayAux3 = arrayAux1[1].split(":");
		this.idade = arrayAux3[1].trim();
		
		String[] arrayAux4 = arrayAux1[2].split(":");
		arrayAux4[1].trim();
			if("FEMININO" == arrayAux4[1]) 
				this.sexo = Sexo.FEMININO;
			else
				this.sexo = Sexo.MASCULINO;
			
		Endereco endereco = new Endereco(arrayAux1[3]);
		this.endereco = endereco;
		
	}
	public Pessoa() {
	}

	
	
	
	
	
	
	
	
	
	

}
