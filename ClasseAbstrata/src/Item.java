
public abstract class Item { // classes abstratas são classes pai que determinam métodos genéricos que as
								// classes herdeiras terão em comum, mas cada uma de um jeito único

	private int posX;
	private int posY;

	public void pegar() { // a classe ser abstrata não determina automaticamente que seus métodos também
							// são abstratos, isso deve ser explicitado

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
