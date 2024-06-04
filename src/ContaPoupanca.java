
public class ContaPoupanca extends Conta{
	
	private double juroSemanal = 0.03;
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void aplicarJuros() {
		super.saldo += saldo*juroSemanal;
	}
}
