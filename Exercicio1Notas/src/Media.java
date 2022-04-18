
public class Media {
	double nota1 = 8.5;
	double nota2 = 7.5;
	double nota3 = 6;
	int peson1 = 3;
	int peson2 = 2;
	int peson3 = 5;

	double media() {
		return ((this.nota1 * this.peson1) + (this.nota2 * this.peson2) + (this.nota3 * this.peson3))
				/ (this.peson1 + this.peson2 + this.peson3);
	}

}
