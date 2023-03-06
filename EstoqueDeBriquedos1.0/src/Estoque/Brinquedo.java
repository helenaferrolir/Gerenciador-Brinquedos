package Estoque;

public abstract class Brinquedo  {
	
    private int codigo;
    private Fornecedor fornecedor;
    private double custo;
    
	public Brinquedo() {
		this.codigo = 0;
		this.custo = 0;
	    this.fornecedor = new Fornecedor();
	}
	
	public Brinquedo(int codigo, Fornecedor fornecedor, double custo) {
		this.codigo = codigo;
		this.custo = custo;
	    this.fornecedor = new Fornecedor();
	    
	}
	
	public abstract double calculaCusto();
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	@Override
	public String toString() {
		return "Brinquedo [Código= " + codigo + ", Fornecedor= " + fornecedor + ", Custo= " + custo + "]";
	}
    
}
