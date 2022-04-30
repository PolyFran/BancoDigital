
public class Main {

	public static void main(String[] args) {
		
        //Instanciando os objetos// 
        Endereco end1 = new Endereco("São Vicente", 102, "Centro", "São Paulo");
        Endereco end2 = new Endereco("Assis Brasil", 874, "Centro", "Belo Horizonte");
        Endereco end3 = new Endereco("Avenida Pedro Silva", 557, "Centro", "Santa Maria");
		
        Cliente cliente1 = new Cliente("João Pereira", end1);
        Cliente cliente2 = new Cliente("Maria da Silva", end2);
        Cliente cliente3 = new Cliente("Pedro Gomes", end2);
        
        Agencia agencia1 = new Agencia("Bradesco", 306, end1);
        Agencia agencia2 = new Agencia("Nubank", 260, end2);
        
        Conta conta1 = new ContaCorrente(cliente1, agencia1, 123);
        Conta conta2 = new ContaPoupanca(cliente2, agencia2, 456);
        Conta conta3 = new ContaCorrente(cliente3, agencia2, 789);
        
        //Mostrando informações dos objetos              
        System.out.println("Trasações Efetuadas em conta de " + cliente1.getNome());
        conta1.depositar(500);
        conta1.sacar(499);
		conta1.imprimirExtrato();
		
		System.out.println("Trasações Efetuadas em conta de " + cliente2.getNome());
		conta2.depositar(1000);
		conta2.transferir(500, conta1);
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
		
	}

}


