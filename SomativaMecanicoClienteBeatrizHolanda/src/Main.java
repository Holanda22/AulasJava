
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Mecanico mecanico1 = new Mecanico("Jurandir", 4001, 60);
		Mecanico mecanico2 = new Mecanico("Valdecir", 4002, 50.5);

		Servico servico1 = new Servico("Troca de Pneu", 1, 12, mecanico2);
		Servico servico2 = new Servico("Troca de Óleo", 3, 15, mecanico1);
		
		Cliente cliente1 = new Cliente("Laura", 3001, servico1, FormaPag.A_VISTA);
		Cliente cliente2 = new Cliente("Claúdio", 3002, servico1, FormaPag.CARNE);
		Cliente cliente3 = new Cliente("Vanessa", 3003, servico2, FormaPag.A_VISTA);
		Cliente cliente4 = new Cliente("Fortunato", 3004, servico2, FormaPag.CARTAO_CREDITO);
		
		
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		
		for(Cliente cliente : clientes) {
			System.out.println("O(A) cliente " + cliente.getNome() + ", cpf " + cliente.getCpf() + ", solicitou o serviço " + cliente.getServico().getNome());
			System.out.println("O mecânico que o realizará será o " + cliente.getServico().getMecanico().getNome());
			System.out.println("Sua forma de pagamento será " + cliente.getFormaPag());
			System.out.println("O valor total a pagar é de R$" + cliente.getValorPagarServico());
			System.out.println("-------------------------------------------------------------------------");
		}
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Clientes.txt"))){
			
			for(Cliente cliente : clientes) {
				escrever.write(cliente.toString() + "\n");
			}
		}
		
		}
		
		

	

}
