
public class Conta implements ContaInt{
	
	
	private static final int  AGENCIA = 123;
	private static int contador = 0;
	
	protected int numero;
	protected double saldo;
	protected Cliente titular;
	protected int numAgencia = AGENCIA;
	
	public Conta(Cliente cliente) {
		this.saldo = 0;
		this.numero = ++contador;
		this.titular = cliente;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void transferir(ContaInt conta, double valor) {
		sacar(valor);
		conta.depositar(valor);
		
	}
	
	public void imprimirDados(){
		System.out.printf("Cliente: %s , conta: %d, saldo: %.2f \n", this.titular.getNome(), this.numero, this.saldo);
	}

}
