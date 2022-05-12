
public abstract class Item { // classes abstratas s�o classes pai que determinam m�todos gen�ricos que as
								// classes herdeiras ter�o em comum, mas cada uma de um jeito �nico

	private int posX;
	private int posY;

	public void pegar() { // a classe ser abstrata n�o determina automaticamente que seus m�todos tamb�m
							// s�o abstratos, isso deve ser explicitado

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
