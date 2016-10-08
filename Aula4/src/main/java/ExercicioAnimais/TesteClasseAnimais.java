package ExercicioAnimais;

public class TesteClasseAnimais {
	public static void main(String args[]){
	
	Baleia duba = new Baleia();
	Jacare zek = new Jacare();
	Macaco jefferson = new Macaco();
	Gato marcos = new Gato();
	//Humano marcella = new Humano();
	Humano thalissa = new Humano();
	
	
	Veterinario marcosVet = new Veterinario();
	
	marcosVet.examinar(duba);
	marcosVet.examinar(zek);
	marcosVet.examinar(jefferson);
	marcosVet.examinar(marcos);
	//marcosVet.examinar(marcella);
	marcosVet.examinar(marcosVet);
	
	
	
	
	}
	

}
