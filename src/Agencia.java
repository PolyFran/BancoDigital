
public class Agencia {

    private String nome;
    private int numero;
    private Endereco endereco;

    public Agencia(String nome, int numero, Endereco endereco) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public String getInfoAgencia() {
        return "Agência do: " + nome + " - Número: " + String.valueOf(numero) +  "\nEndereço:" + endereco.getEnderecoCompleto();

    }

}