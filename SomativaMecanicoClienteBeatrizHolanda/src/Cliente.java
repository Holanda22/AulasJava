import java.io.BufferedWriter;
import java.io.FileWriter;

public class Cliente extends Usuario {
	private double valorPagarServico;
	private Servico servico;
	private FormaPag formaPag;

	public Cliente(String nome, int cpf, Servico servico, FormaPag formaPag) {
		super(nome, cpf);
		this.servico = servico;
		this.formaPag = formaPag;
	}

	public double getValorPagarServico() {

		double juros = ((servico.getValorHoraServico() * servico.getQtdHorasServico())
				+ servico.getMecanico().getMaoDeObra()) * formaPag.getJuros();
		 
		return valorPagarServico = ((servico.getValorHoraServico() * servico.getQtdHorasServico())
					+ servico.getMecanico().getMaoDeObra()) + juros;
	}

	public void setValorPagarServico(double valorPagarServico) {
		this.valorPagarServico = valorPagarServico;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public FormaPag getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormaPag formaPag) {
		this.formaPag = formaPag;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [valorPagarServico=" + valorPagarServico + ", servico=" + servico + ", formaPag=" + formaPag
				+ "]";
	}

}
