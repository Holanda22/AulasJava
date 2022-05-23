
public class main {
	
	private enum Sexo{ //possível criar enum's dentro das próprias classes
		MASCULINO, FEMININO;
	}

	public static final double PI = 3.14; // contantes de uma variável só comportam um único valor contante

	public static void main(String[] args) {

		// construção de um enum:
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; //a variável "hoje" guarda o endereço do objeto SEGUNDA
		System.out.println(hoje);
		
		double pi = main.PI; //a variável "pi" guarda o valor de PI
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		
		hoje = DiaDaSemana.valueOf(s); //conversão de uma variável do tipo do enum para String
		System.out.println(hoje);

		Sexo sexo= Sexo.FEMININO;
		System.out.println(sexo);
		sexo = Sexo.MASCULINO;
		System.out.println(sexo);
		
	}

}
