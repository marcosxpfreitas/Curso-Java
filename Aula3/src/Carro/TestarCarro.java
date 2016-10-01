package Carro;

public class TestarCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Ford","Mustang","vermelho",2015,0);
		Carro carro2 = new Carro("Ford","Pampa","vermelho",2006,0);
		
		carro1.acelerar(100);
		carro2.acelerar(200);
		if(carro2.freiar(201)==false){
			System.out.println("Você não pode freiar mais do que a velocidade atual, que é de "+carro2.velocidade+" KM/S");
			
		}else{
			System.out.println();
			System.out.println(carro2.modelo+" velocidade atual =  "+carro2.getVelocidade()+" KM");
		}
		System.out.println(carro1.modelo+" velocidade atual =  "+carro1.getVelocidade()+ " KM");
		
	}

}
