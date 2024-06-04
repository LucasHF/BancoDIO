
public class Main {

	public static void main(String[] args) {
		
		Banco meuBanco = new Banco("Banco da DIO");
		String[] clientes = {"Pedro", "Marcos", "Laura", "Ana", "Marcelo"};
		
		for(String c: clientes) {
			meuBanco.adicionarCliente(new Cliente(c));
		}
		
		for(Cliente c: meuBanco.getClientes()) {
			if(c.getNome().startsWith("M")) {
				meuBanco.adicionarConta(new ContaCorrente(c));
			}else {
				meuBanco.adicionarConta(new ContaPoupanca(c));
			}
		}
		
		for(Conta conta : meuBanco.getContas()) {
			conta.imprimirDados();
		}
	}

}
