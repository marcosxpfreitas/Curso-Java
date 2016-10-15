package main.java;

import java.util.HashSet;
import java.util.Set;

import aula5.list.Pessoa;

public class TestarSet {
	/*
	 *  Com set não há possibilidade de controlar elementos pelo seu index.   
	*/
	
	
	public static void main (String args[]){
		Set<String> meuSet = new HashSet<>();
		meuSet.add("Valor 1");
		meuSet.add("Valor 2");
		meuSet.add("Valor 3");
		meuSet.add("Valor 3");
		
		for (String valor: meuSet){
			System.out.println(valor);
		}
		
	}
}
