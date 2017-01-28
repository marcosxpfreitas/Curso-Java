package br.com.projeto.domain;

public class Livro{
	private String autor;
	private String titulo;
	private String tema;
	
	public Livro(String autor ,String titulo, String tema){
		this.autor = autor;
		this.titulo = titulo;
		this.tema = tema;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setNome(String titulo) {
		this.titulo = titulo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
}
