
public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int hora = 25;
	private int minuto = 25;
	private int segundo = 25;
	static final boolean FORMATO_12H = true;
	static final boolean FORMATO_24H = false;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void Imprimir(boolean formato) {

		String data = dia + "/" + mes + "/" + ano;

		if (hora >= 25) {
			System.out.println(data);
		} else {
			String horario = ":" + minuto + ":" + segundo;

			if (formato == FORMATO_24H) {
				horario = hora + horario;
			} else {
				if (hora == 0) {
					horario = (hora + 12) + horario;
					horario += " AM";
				} else if (hora == 12) {
					horario = hora + horario;
					horario += " PM";
				} else if (hora < 12) {
					horario = (hora - 12) + horario;
					horario = " PM";
				} else {
					horario = hora + horario;
					horario += " AM";
				}

			}

		}

	}

}
