
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Agencia agencia, int numero) {
		super(cliente, agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n=== Extrato Conta Poupança ===\n");
		super.imprimirInfosComuns();
	}
}
