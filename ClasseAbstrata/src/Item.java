
public abstract class Item { // classes abstratas s�o classes pai que determinam m�todos gen�ricos que as
								// classes herdeiras ter�o em comum, mas cada uma de um jeito �nico

	private int posX;
	private int posY;

	public abstract void pegar(); // a classe ser abstrata n�o determina automaticamente que seus m�todos tamb�m
									// s�o abstratos, isso deve ser explicitado

	public int getPosX() { // m�todos n�o explicitados como abstratos, seguem os conceitos de heran�a e
							// est�o vis�veis para as subclasses, mas n�o s�o obrigat�rios
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
