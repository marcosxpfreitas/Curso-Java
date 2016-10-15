package aula5.list;
import java.util.Scanner;
import ExercicioGaragem.Garagem;
import ExercicioGaragem.Veiculo;

public class ClasseMain {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		Garagem garagem = new Garagem();
		String modelo;
		String marca;
		String placa;
		int ano;
		double preco;
		int opcao=0;
		do{
			
			System.out.println("CONTROLE CARROS - DEXTRAINING");
			System.out.println("1-ADICIONAR");
			System.out.println("2-VENDER (POR PLACA)");
			System.out.println("3-BUSCAR (POR PLACA)");
			System.out.println("4-LISTAR");
			System.out.println("5-SAIR");
			opcao = ler.nextInt();
			switch (opcao){
			case 1:
				System.out.println("Digite a marca do carro");
				marca = ler.next();
				System.out.println("Digite o modelo do carro");
				modelo = ler.next();
				System.out.println("Digite a placa do carro");
				placa = ler.next();
				System.out.println("Digite o ano do carro");
				ano = ler.nextInt();
				System.out.println("Digite o preco do carro");
				preco = ler.nextDouble();
				Veiculo veiculo = new Veiculo(marca,modelo,placa,ano,preco);
				
				if(garagem.adicionarCarro(veiculo)==true){
					System.out.println("Veiculo adicionado com sucesso");
				}else
					System.out.println("Veiculo já existe");
			
				
				break;
			
			case 2:
				System.out.println("Venda de carros");
				System.out.println("Placa:");
				placa = ler.next();
				boolean vender = garagem.venderCarro(placa);
				if(vender==true){
					System.out.println("Carro vendido com sucesso!");
				}else
				{
					System.out.println("Placa não existe!");
				}
				
				break;
		
			case 3:
				System.out.println("Venda de carros");
				System.out.println("Placa:");
				placa = ler.next();
				System.out.println("Carro buscado: ");
				garagem.buscarCarro(placa);
				break;
			
			case 4:
				for(Veiculo v : garagem.listarVeiculos()) {
				System.out.println("Marca: "+ v.getMarca());
				System.out.println("Modelo: "+ v.getModelo());
				System.out.println("Placa: "+ v.getPlaca());
				System.out.println("Ano: "+ v.getAno());
				System.out.println("Preco: R$"+ v.getPreco());
				break;
				
				}
			}
			
		}while(opcao != 5);
	
	}
}
		
	

	
	




	
