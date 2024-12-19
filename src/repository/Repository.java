package repository;

import projeto_final_bloco_01.Livro;

public interface Repository {

	public void adicionar(String adcionar);

	public Livro buscar(String titulo);

	public void atualizar(String tituloAntigo);

	public void deletar(String titulo);

	public void listar();

	void adicionar(Livro livro);

	void atualizar(String tituloAntigo, Livro novoLivro);

}
