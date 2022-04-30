
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Agencia agencia, int numero) {
		super(cliente, agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n=== Extrato Conta Corrente ===\n");
		super.imprimirInfosComuns();
	}
	
}
