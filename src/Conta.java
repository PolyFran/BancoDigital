

public abstract class Conta implements IConta {


	protected Agencia agencia;
	protected int numero;
	protected double saldo;
	protected double limite;
	protected Cliente cliente;

	public Conta(Cliente cliente, Agencia agencia, int numero) {
		this.agencia = agencia;
		this.cliente = cliente;
		this.numero = numero;
	}

	@Override
	public void sacar(double valor) {
	        if ((valor < 0) || (valor > 500) || (valor > saldo + limite)) {
	            System.out.println("Valor de saque inválido!");
	        } else if ((valor <= (saldo + limite)) && (valor <= 500)) {
	            saldo = saldo - valor;
	            System.out.println("Saque efetuado de R$: " + valor);
	        }
	    }
	

	@Override
	public void depositar(double valor) {
		if (valor < 100) {
            System.out.println("Valor de depósito inválido!");
        } else if (valor >= 100) {
            saldo = saldo + valor;
            System.out.println("Depósito efetuado de R$: " + valor);
        }
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		 System.out.println("Valor transferido para conta: " + contaDestino.getNumero());
	}

	public Agencia getAgencia() {
		return agencia;
	}

	@Override
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println("Titular: " + cliente.getNome());
		System.out.println("Agencia: "+ agencia.getNumero());
		System.out.println("Número Conta: " + this.numero );
		System.out.println(String.format("Saldo: %.2f", this.saldo) + "\n");
	}
}



