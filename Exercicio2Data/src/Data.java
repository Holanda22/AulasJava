
public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;
	static final boolean FORMATO_12H = true;
	static final boolean FORMATO_24H = false;
	
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void Imprimir(boolean formato) {
		if(formato==false && hora>=0 && hora<=23) {
			System.out.println(dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto + ":" + segundo);	
		}
		else if(formato==true && hora>=0 && hora<12) {
			System.out.println(dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto + ":" + segundo + "AM");	
		}
		else if(formato==true && hora>=0 && hora>12 && hora<=23) {
			System.out.println(dia + "/" + mes + "/" + ano + " " + hora/12 + ":" + minuto + ":" + segundo + "PM");	
		}
		
		
		
	}
	
	
	
	
	
	
	

}
