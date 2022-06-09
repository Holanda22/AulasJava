
public class Mecanico extends Usuario{
	private double maoDeObra;

	public Mecanico(String nome, int cpf, double maoDeObra) {
		super(nome, cpf);
		this.maoDeObra = maoDeObra;
	}

	public double getMaoDeObra() {
		return maoDeObra;
	}

	public void setMaoDeObra(double maoDeObra) {
		this.maoDeObra = maoDeObra;
	}

	@Override
	public String toString() {
		return super.toString() + "Mecanico [maoDeObra=" + maoDeObra + "]";
	}
}
