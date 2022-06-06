
public class Matematica {

	int somar(int x, int y) { // sobrecarga de métodos é quando cria-se métodos com a mesma assinatura, mas
								// parâmetros diferentes

		return x + y;
		// int z = x + y;
		// return z;

	}

	int somar(int x, int y, int z) {

		return x + y + z;

	}

	double somar(double x, double y) {

		return x + y;

	}

}
