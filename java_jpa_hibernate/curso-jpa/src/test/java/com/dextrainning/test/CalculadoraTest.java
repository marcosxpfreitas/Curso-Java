package com.dextrainning.test;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calculadora = new Calculadora();

	@Test
	public void testarSoma() {
		Double resultado = calculadora.somar(5, 5);
		Assert.assertEquals(Double.valueOf(10), resultado);
	}
	
	@Test()
	public void testarSubtracao() {
		Double resultado = calculadora.subtrair(5, 6);
		Assert.assertEquals(Double.valueOf(-1), resultado);
	}

	@Test
	public void testarMultiplicacao() {
		Double resultado = calculadora.multiplicar(5, 6);
		Assert.assertEquals(Double.valueOf(30), resultado);
	}

	@Test
	public void testarDivisao() {
		Double resultado = calculadora.dividir(10, 2);
		Assert.assertEquals(Double.valueOf(5), resultado);
	}
}
