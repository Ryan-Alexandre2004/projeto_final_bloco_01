package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		int opcao;

		do {
			System.out.println("\n===== Biblioteca dos Colegas =====");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Buscar livro");
			System.out.println("3 - Atualizar a Lista");
			System.out.println("4 - Deletar");
			System.out.println("5 - Listar livros");
			System.out.println("6 - Sair");
			System.out.print("Escolha uma opção: ");

			while (!scanner.hasNextInt()) {
				System.out.print("Por favor, insira um número válido: ");
				scanner.next();
			}
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o título do livro: ");
				String titulo = scanner.nextLine();
				System.out.print("Digite o autor do livro: ");
				String autor = scanner.nextLine();
				biblioteca.adicionarLivro(new Livro(titulo, autor));
				break;
			case 2:
				System.out.print("Digite o título do livro para busca: ");
				String tituloBusca = scanner.nextLine();
				Livro livroBuscado = biblioteca.buscarLivro(tituloBusca);
				if (livroBuscado != null) {
					System.out.println("Livro encontrado: " + livroBuscado);
				} else {
					System.out.println("Livro não encontrado.");
				}
				break;
			case 3:
				System.out.print("Digite o título do livro a ser atualizado: ");
				String tituloAntigo = scanner.nextLine();
				System.out.print("Digite o novo título do livro: ");
				String novoTitulo = scanner.nextLine();
				System.out.print("Digite o novo autor do livro: ");
				String novoAutor = scanner.nextLine();
				biblioteca.atualizarLivro(tituloAntigo, novoTitulo, novoAutor);
				break;
			case 4:
				System.out.print("Digite o título do livro a ser deletado: ");
				String tituloDeletar = scanner.nextLine();
				biblioteca.deletarLivro(tituloDeletar);
				break;
			case 5:
				biblioteca.listarLivros();
				break;
			case 6:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 6);

		scanner.close();
	}
}
