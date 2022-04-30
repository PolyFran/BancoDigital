
public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private Endereco endereco;
	
	public Cliente(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	
    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getDadosPessoa() {
        return nome + ", CPF: " + cpf + ", Telefone: " + telefone + "\nEndereço: " + endereco.getEnderecoCompleto();

    }

}
