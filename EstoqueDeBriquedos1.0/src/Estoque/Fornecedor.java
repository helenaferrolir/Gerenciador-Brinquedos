package Estoque;

public class Fornecedor {
	
    private String nome;
    private int telefone;
    
	public Fornecedor() {
		this.setNome("-");
		this.setTelefone(0);
	}
	public Fornecedor(String nome, int telefone) {
		this.setNome(nome);
		this.setTelefone(telefone);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String toString() {
		return "Fornecedor [Nome= " + nome + ", Telefone= " + telefone + "]";
	}
	

}
