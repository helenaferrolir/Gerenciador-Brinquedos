package Estoque;

public class Boneca extends Brinquedo implements ImpostoProdutos {

	private double precoUnitarioBoneca;
	private String corDaPele;

	public Boneca() {
		super();
		this.precoUnitarioBoneca = 0;
		this.corDaPele = "-";
	}

	public Boneca(int codigo, Fornecedor fornecedor, double custo, double precoUnitarioBoneca, String corDaPele) {
		super(codigo, fornecedor, custo);
		this.precoUnitarioBoneca = precoUnitarioBoneca;
		this.corDaPele = corDaPele;

	}

	public double calculaImpostos() {

		return getPrecoUnitarioBoneca() * 1.05;
	}

	public double calculaCusto() {

		return calculaImpostos() + getCusto();
	}

	public double getPrecoUnitarioBoneca() {
		return precoUnitarioBoneca;
	}

	public void setPrecoUnitarioBoneca(double precoUnitarioBoneca) {
		this.precoUnitarioBoneca = precoUnitarioBoneca;
	}

	public String getCorDaPele() {
		return corDaPele;
	}

	public void setCorDaPele(String corDaPele) {
		this.corDaPele = corDaPele;
	}

	@Override
	public String toString() {
		return "Boneca -> Preço Unitário= " + precoUnitarioBoneca + ", Cor da boneca= " + corDaPele;
	}

}
