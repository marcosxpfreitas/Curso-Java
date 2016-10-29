package aula4.animal;

public class TestarAnimais {

	public static void main(String[] args) {
		Baleia baleia = new Baleia();
		Jacare jacare = new Jacare();
		// Humano humano = new Humano();

		Veterinario veterinario = new Veterinario();
		veterinario.examinar(baleia);
		veterinario.examinar(jacare);
		// veterinario.examinar(humano);
	}
}
