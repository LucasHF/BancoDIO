import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;
	
	public Banco(String nome) {
		this.setNome(nome);
		this.setContas(new ArrayList<Conta>());
		this.setClientes(new ArrayList<Cliente>());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void adicionarConta(Conta novaConta) {
		this.contas.add(novaConta);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void adicionarCliente(Cliente novoCliente) {
		this.clientes.add(novoCliente);
	}
}
