package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.Biblioteca;
import projeto_final_bloco_01.Livro;

public class Controller {

	private Biblioteca biblioteca;
	private Scanner scanner;

	public Controller() {
		biblioteca = new Biblioteca();	scanner = new Scanner(System.in);
	}

	public void exibirMenu() {
		int opcao = 0;
		do {
			try {
				System.out.println("\n===== Biblioteca =====");
				System.out.println("1 - Adicionar Livro");
				System.out.println("2 - Buscar Livro");
				System.out.println("3 - Atualizar Livro");
				System.out.println("4 - Deletar Livro");
				System.out.println("5 - Listar Livros");
				System.out.println("6 - Sair");
				System.out.print("Escolha uma opção: ");
				opcao = scanner.nextInt();
				scanner.nextLine();

				switch (opcao) {
				case 1:
					adicionarLivro();
					break;
				case 2:
					buscarLivro();
					break;
				case 3:
					atualizarLivro();
					break;
				case 4:
					deletarLivro();
					break;
				case 5:
					biblioteca.listar();
					break;
				case 6:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Por favor, insira um número.");
				scanner.nextLine();
			}
		} while (opcao != 6);
	}

	private void adicionarLivro() {
		System.out.print("Digite o título do livro: ");
		String titulo = scanner.nextLine();
		System.out.print("Digite o autor do livro: ");
		String autor = scanner.nextLine();
		Livro livro = new Livro(titulo, autor);
		biblioteca.adicionar(livro);
	}

	private void buscarLivro() {
		System.out.print("Digite o título do livro para buscar: ");
		String titulo = scanner.nextLine();
		Livro livro = biblioteca.buscar(titulo);
		if (livro != null) {
			System.out.println("Livro encontrado: " + livro);
		} else {
			System.out.println("Livro não encontrado.");
		}
	}

	private void atualizarLivro() {
		System.out.print("Digite o título do livro para atualizar: ");
		String tituloAntigo = scanner.nextLine();
		System.out.print("Digite o novo título: ");
		String novoTitulo = scanner.nextLine();
		System.out.print("Digite o novo autor: ");
		String novoAutor = scanner.nextLine();
		Livro novoLivro = new Livro(novoTitulo, novoAutor);
		biblioteca.atualizar(tituloAntigo, novoLivro);
	}

	private void deletarLivro() {
		System.out.print("Digite o título do livro para deletar: ");
		String titulo = scanner.nextLine();
		biblioteca.deletar(titulo);
	}

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.exibirMenu();
	}
}
