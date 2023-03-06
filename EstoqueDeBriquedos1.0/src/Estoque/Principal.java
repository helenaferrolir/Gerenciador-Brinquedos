package Estoque;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("\n=======================================");
		System.out.println("\n        ESTOQUE DE BRINQUEDOS          ");
		GerenciadorBrinquedos gb = new GerenciadorBrinquedos();
		Scanner sc = new Scanner(System.in);
		
		int op=0;
		int aux=0;
		do {
			try {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite:\n1- Adicionar Brinquedo\n2- Remover Brinquedo\n3- Imprimir Itens\n4- Buscar Brinquedo\n5- Valor de Produção\n6- Sair!"));
			
			}catch(InputMismatchException e) {
				System.out.println("Tente novamente"+e);
			}
			switch(op) {
			case 1:
				aux=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 1 > Carro ou 2 para > Boneca "));
				if(aux==1) {
					Carro c = new Carro();
					c.setCodigo((Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código: "))));
					Fornecedor f = new Fornecedor();
					f.setNome((JOptionPane.showInputDialog(null,"FORNECEDOR\nDigite o nome do fornecedor: ")));
					f.setTelefone((Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número do fornecedor: "))));
					c.setCusto(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o custo do produto: ")));
					c.setPrecoUnitarioCarro(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço da unidade: ")));
					c.setModelo((JOptionPane.showInputDialog(null,"Digite o modelo: ")));
					gb.addBrinquedo(c);

				}else {
					Boneca b = new Boneca();
					b.setCodigo((Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código: "))));
					Fornecedor f = new Fornecedor();
					f.setNome((JOptionPane.showInputDialog(null,"FORNECEDOR\nDigite o nome do fornecedor: ")));
					f.setTelefone((Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número do fornecedor: "))));
					b.setCusto(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o custo do produto: ")));
					b.setPrecoUnitarioBoneca(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço da unidade: ")));
					b.setCorDaPele((JOptionPane.showInputDialog(null,"Digite o cor de pele: ")));
					gb.addBrinquedo(b);

				}
								
				break;
			case 2:
				gb.removerBrinquedo(Integer.parseInt(JOptionPane.showInputDialog(null,"Digete um número para remover")));
				break;
			case 3:
				gb.imprimirEstoque();
				break;
			case 4:
				int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Digete o código:"));
				gb.buscarBrinquedo(x);
				break;
			case 5:
				
				gb.valorDeProducao();
				break;
           // try {
			case 6:
				JOptionPane.showMessageDialog(null, "Até mais, volte sempre!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida! tente de novo");
				break;
			}
		
			
		}while(op!=5);
		System.out.println("\n=======================================");
		sc.close();
		
	}
		
	}


