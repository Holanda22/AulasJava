
public class Matematica {

	int somar(int x, int y) { // sobrecarga de m�todos � quando cria-se m�todos com a mesma assinatura, mas
								// par�metros diferentes

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
