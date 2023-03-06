package Estoque;

public class Carro extends Brinquedo{

	private double precoUnitarioCarro;
	private String modelo;
	
	public Carro() {
		super();
		this.precoUnitarioCarro = 0;
		this.modelo = "-";
		
	}
	
	public Carro(int codigo, Fornecedor fornecedor, double custo, double precoUnitarioCarro,String modelo) {
		super(codigo, fornecedor, custo);
		this.precoUnitarioCarro = precoUnitarioCarro;
		this.modelo = modelo;
	}



	public double calculaCusto() {
		
		return getPrecoUnitarioCarro() + getCusto();
	}


	public double getPrecoUnitarioCarro() {
		return precoUnitarioCarro;
	}


	public void setPrecoUnitarioCarro(double precoUnitarioCarro) {
		this.precoUnitarioCarro = precoUnitarioCarro;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro -> Preço Unitário= " + precoUnitarioCarro + ", Modelo do carro= " + modelo;
	}
	

}
