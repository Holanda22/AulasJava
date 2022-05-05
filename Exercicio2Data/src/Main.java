
public class Main {

	public static void main(String[] args) {
		
		Data d1 = new Data(22, 05, 2004, 22, 30, 20);
		
		d1.Imprimir(Data.FORMATO_12H);
		d1.Imprimir(Data.FORMATO_24H);
		
		Data d2 = new Data(22, 05, 2004, 10, 30, 20);
				
		d2.Imprimir(Data.FORMATO_12H);
		d2.Imprimir(Data.FORMATO_24H);
		
		Data d3 = new Data(22, 05, 2004);
		
		d3.Imprimir(Data.FORMATO_12H);
		d3.Imprimir(Data.FORMATO_24H);
		

	}

}
