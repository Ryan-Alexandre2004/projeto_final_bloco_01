package repository;

public interface Repository {

	public void adicionar(String adcionar);

	public void buscar(String titulo);

	public void atualizar(String tituloAntigo);

	public void deletar(String titulo);

	public void listar();

}
