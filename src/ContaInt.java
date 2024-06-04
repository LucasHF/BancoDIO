
public interface ContaInt {
	void depositar(double valor);
	void sacar(double valor);
	void transferir(ContaInt conta, double valor);
}
