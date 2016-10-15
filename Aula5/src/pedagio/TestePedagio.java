package pedagio;

public class TestePedagio {
	public static void main(String args[]){
		Carro c = new Carro("Vectra","Azul",2);
		Caminhao cm = new Caminhao("Mercedes","Prata",3);
		Moto m = new Moto("Honda","vermelho",1);
		Bicicleta b = new Bicicleta("Caloi","Verde",1);
		Carro c2 = new Carro("Monza","azul",2);
		
		CalculadorPedagio cp = new CalculadorPedagio();
		System.out.println("Moto R$"+ cp.Calcular(m));
		System.out.println("Carro R$"+ cp.Calcular(c));
		System.out.println("Caminhão R$"+ cp.Calcular(cm));
		
		Veiculo veiculo[] = {c,cm,m,b,c2};
		
		for(int i=0; i<veiculo.length;i++){
			if(veiculo[i] instanceof Caminhao){
				System.out.println(veiculo[i].getModelo()+" é um caminhão");
			}else if(veiculo[i] instanceof Carro){
				System.out.println(veiculo[i].getModelo()+" é um carro");
			}
		}
		
		
		
	}

}
