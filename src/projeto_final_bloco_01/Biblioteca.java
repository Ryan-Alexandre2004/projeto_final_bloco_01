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
	public void adicionar(Livro livro) {
		livros.add(livro);
		System.out.println("Livro adicionado com sucesso!");
	}

	@Override
	public Livro buscar(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro; // Retorna o livro encontrado
			}
		}
		return null;
	}

	public void atualizar(String tituloAntigo, Livro novoLivro) {
		Livro livroExistente = buscar(tituloAntigo);
		if (livroExistente != null) {
			livroExistente.setTitulo(novoLivro.getTitulo());
			livroExistente.setAutor(novoLivro.getAutor());
			System.out.println("Livro atualizado com sucesso!");
		} else {
			System.out.println("Livro não encontrado.");
		}
	}

	@Override
	public void deletar(String titulo) {
		Livro livro = buscar(titulo);
		if (livro != null) {
			livros.remove(livro);
			System.out.println("Livro deletado com sucesso!");
		} else {
			System.out.println("Livro não encontrado.");
		}
	}

	@Override
	public void listar() {
		if (livros.isEmpty()) {
			System.out.println("Nenhum livro na biblioteca.");
		} else {
			for (Livro livro : livros) {
				System.out.println(livro);
			}
		}
	}

	@Override
	public void adicionar(String adicionar) {

		Livro livro = new Livro(adicionar, "Autor Desconhecido");
		livros.add(livro);
		System.out.println("Livro adicionado: " + livro);
	}

	@Override
	public void atualizar(String tituloAntigo) {
		
		
	}
}
