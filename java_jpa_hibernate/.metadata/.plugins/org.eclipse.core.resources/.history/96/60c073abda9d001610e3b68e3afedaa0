package com.dextraining.teste;

import org.junit.Assert;
import org.junit.Test;

/*A palavra test no final do nome da classe, define que essa classe representa 
um teste.*/
public class CalculadoraTeste {
	private Calculadora calculadora = new Calculadora();
	
	@Test
	public void testarSoma(){
		Double resultado=calculadora.somar(5.0,5.0);
		Assert.assertEquals(Double.valueOf(10), resultado);
		
	}
	@Test
	public void testarSubtracao(){
		Double resultado=calculadora.subtrair(5.0,5.0);
		Assert.assertEquals(Double.valueOf(0), resultado);
		
	}
	@Test
	public void testarMultiplicacao(){
		Double resultado=calculadora.multiplicar(5.0,5.0);
		Assert.assertEquals(Double.valueOf(25), resultado);
		
	}
	@Test
	public void testarDivisao(){
		Double resultado=calculadora.dividir(5.0,5.0);
		Assert.assertEquals(Double.valueOf(1), resultado);
		
	}

}
