package Estoque;

import java.util.ArrayList;

 public class GerenciadorBrinquedos {
	ArrayList<Brinquedo> lista;
	
	public GerenciadorBrinquedos() {
		
			this.lista = new ArrayList<Brinquedo>();
		
	}
	public void addBrinquedo(Brinquedo brinc) {
		
		for(Brinquedo b: this.lista) {
			if(b.getCodigo()== brinc.getCodigo()) {
				System.out.println("Erro! Brinquedo já existe no estoque ");
				return;
			}
		}
		this.lista.add(brinc);
		System.out.println("Brinquedo cadastrado com sucesso!");
	}
	
	public void removerBrinquedo(int cod) {
   	 for(Brinquedo b: this.lista) {
			if(b.getCodigo()== cod) {
				this.lista.remove(b);
				System.out.println("Brinquedo removido!");
				return;
			}
		}
		System.out.println("Brinquedo não encontrado");
    }
	
	public double valorDeProducao() {
   	 double cont=0;
   	 for(Brinquedo b: this.lista) {
   		 cont+=b.calculaCusto();
   	 }
   	 return cont;
    }
	public void buscarBrinquedo(int cod) {
		for(Brinquedo b: this.lista) {
    		if(b.getCodigo()==cod) {
    			System.out.println("Brinquedo: \n"+b);
    		}
		}
    		   
	}
	 public void imprimirEstoque() {
    	for(Brinquedo b: this.lista) {
    		System.out.println("Brinquedo: \n"+b);
    	}
    }

}
