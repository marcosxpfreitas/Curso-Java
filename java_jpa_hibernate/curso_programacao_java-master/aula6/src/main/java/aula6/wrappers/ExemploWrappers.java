package aula6.wrappers;

public class ExemploWrappers {

	public static void main(String[] args) {
		Float meuValor = 10f;

		Float meuValorConvertido = Float.valueOf("10");
		System.out.println(meuValorConvertido);

		Character c = 'A';
		Integer integer = 10;

		Double valorDouble = 5D;
		Boolean valorBoolean = true;
		
		// Converte para hexa
		System.out.println(Integer.toHexString(1000));
		// Hexa para decimal
		System.out.println(Integer.valueOf("3e8", 16));
		// Converte para binario
		System.out.println(Integer.toBinaryString(10));
	}
}
