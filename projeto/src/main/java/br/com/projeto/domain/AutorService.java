package br.com.projeto.domain;

import java.util.ArrayList;
import java.util.List;

public class AutorService {
	
	private static List<Autor> autores = new ArrayList<>();
	
	public static void salvarAutor(Autor autor){
		autores.add(autor);
	}
	public static List<Autor> listarAutores(){
		return autores;
	}
	public static Autor buscarAutorPorNome(String nomeAutor){
		for(Autor autor: autores){
			if(autor.getNome().equals(nomeAutor)){
				return autor;
			}
		}
		return null;
	}

}
