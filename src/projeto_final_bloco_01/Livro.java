package projeto_final_bloco_01;

public class Livro {
	private String titulo;
	private String autor;

	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + ", Autor: " + autor;
	}

	public void setAutor(String autor2) {
	
		
	}

	public void setTitulo(String titulo2) {
	
		
	}
	
}

	
