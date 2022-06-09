
public class Servico {

	private String nome;
	private double qtdHorasServico;
	private double valorHoraServico;
	private Mecanico mecanico;
	
	public Servico(String nome, double qtdHorasServico, double valorHoraServico, Mecanico mecanico) {
		super();
		this.nome = nome;
		this.qtdHorasServico = qtdHorasServico;
		this.valorHoraServico = valorHoraServico;
		this.mecanico = mecanico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQtdHorasServico() {
		return qtdHorasServico;
	}

	public void setQtdHorasServico(double qtdHorasServico) {
		this.qtdHorasServico = qtdHorasServico;
	}

	public double getValorHoraServico() {
		return valorHoraServico;
	}

	public void setValorHoraServico(double valorHoraServico) {
		this.valorHoraServico = valorHoraServico;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	@Override
	public String toString() {
		return "Servico [nome=" + nome + ", qtdHorasServico=" + qtdHorasServico + ", valorHoraServico="
				+ valorHoraServico + ", mecanico=" + mecanico + "]";
	}
	
	
	
	
	
}
