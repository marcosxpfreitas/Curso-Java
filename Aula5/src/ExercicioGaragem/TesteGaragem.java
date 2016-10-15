package ExercicioGaragem;

import java.util.List;
import java.util.Scanner;

public class TesteGaragem {
	public static void main(String args[]){
		Garagem garagem = new Garagem();
		Scanner ler = new Scanner(System.in);
		String marca="gm";
		String modelo="corsa";
		String placa ="2938293";
		int ano=1054;
		double preco=20.00;
		Veiculo veiculo = new Veiculo(marca,modelo,placa,ano,preco);
		garagem.adicionarCarro(veiculo);
		
		
		for(Veiculo v : garagem.listarVeiculos()) {
			System.out.println("Marca: "+ v.getModelo());
			System.out.println("Modelo: "+ v.getModelo());
			System.out.println("Placa: "+ v.getPlaca());
			System.out.println("Ano: "+ v.getAno());
			System.out.println("Preco: "+ v.getPreco());
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
