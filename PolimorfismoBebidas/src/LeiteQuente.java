
public class LeiteQuente extends Bebida{

	public LeiteQuente() {
		super("Leite quente", true);
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando leite no copo");
	}
	
	
	

}
