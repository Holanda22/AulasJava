package fundamentos;

public class Funcionario {
	private String nome;
	private double salario;
	private Cargo cargo;

	enum Cargo {
		OPERADOR_DE_MAQUINAS("Operador de Maquinas", 1747), 
		ASSISTENTE_ADMINISTRATIVO("Assistente Administrativo", 1782),
		GESTOR_FINANCEIRO("Gestor Financeiro", 3260);

		private String nome;
		private double salario;

		private Cargo(String nome, int salario) {
			this.nome = nome;
			this.salario = salario;
		}
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(int salario) {
			this.salario = salario;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario() {
		salario = cargo.salario;
	}

	public String getCargo() {
		return cargo.nome;
	}

	public void setCargo(int num) {
		if (num == 1) {
			cargo = Cargo.OPERADOR_DE_MAQUINAS;
		} else if (num == 2) {
			cargo = Cargo.ASSISTENTE_ADMINISTRATIVO;
		} else if (num == 3) {
			cargo = Cargo.GESTOR_FINANCEIRO;
		} 
	}
	
	

}
