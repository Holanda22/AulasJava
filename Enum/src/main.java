
public class main {
	
	private enum Sexo{ //poss�vel criar enum's dentro das pr�prias classes
		MASCULINO, FEMININO;
	}

	public static final double PI = 3.14; // contantes de uma vari�vel s� comportam um �nico valor contante

	public static void main(String[] args) {

		// constru��o de um enum:
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; //a vari�vel "hoje" guarda o endere�o do objeto SEGUNDA
		System.out.println(hoje);
		
		double pi = main.PI; //a vari�vel "pi" guarda o valor de PI
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		
		hoje = DiaDaSemana.valueOf(s); //convers�o de uma vari�vel do tipo do enum para String
		System.out.println(hoje);

		Sexo sexo= Sexo.FEMININO;
		System.out.println(sexo);
		sexo = Sexo.MASCULINO;
		System.out.println(sexo);
		
	}

}
