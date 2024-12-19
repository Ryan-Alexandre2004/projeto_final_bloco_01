package projeto_final_bloco_01;

import java.util.ArrayList;
import repository.Repository;

public class Biblioteca implements Repository {
	private ArrayList<Livro> livros;

	public Biblioteca() {
		livros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		livros.add(livro);
		System.out.println("Livro adicionado com sucesso!");
	}

	public Livro buscarLivro(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		return null;
	}

	public boolean atualizarLivro(String tituloAntigo, String novoTitulo, String novoAutor) {
		Livro livro = buscarLivro(tituloAntigo);
		if (livro != null) {
			livros.remove(livro);
			livros.add(new Livro(novoTitulo, novoAutor));
			System.out.println("Livro atualizado com sucesso!");
			return true;
		}
		System.out.println("Livro não encontrado para atualização.");
		return false;
	}

	public boolean deletarLivro(String titulo) {
		Livro livro = buscarLivro(titulo);
		if (livro != null) {
			livros.remove(livro);
			System.out.println("Livro deletado com sucesso!");
			return true;
		}
		System.out.println("Livro não encontrado para deletar.");
		return false;
	}

	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("A biblioteca está vazia.");
		} else {
			for (Livro livro : livros) {
				System.out.println(livro);
			}
		}
	}

	@Override
	public void adicionar(String adcionar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscar(String titulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(String tituloAntigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(String titulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}
}
