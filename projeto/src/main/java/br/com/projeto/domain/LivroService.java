package br.com.projeto.domain;

import java.util.ArrayList;
import java.util.List;



public class LivroService {
	
	private static List<Livro> livros = new ArrayList<>();
	
	public static void salvarLivro(Livro livro){
		livros.add(livro);
	}
	public static List<Livro> listarLivros(){
		return livros;
	}
	public static Livro buscarLivroPorTitulo(String titulo){
		for(Livro livro:livros){
			if(livro.getTitulo().equals(titulo)){
				return livro;
			}
		}
		return null;
	}
	
}
