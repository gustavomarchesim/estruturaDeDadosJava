package com.gdam.estruturadados.pilhas.labs;

import java.util.Scanner;

import com.gdam.estruturadados.pilhas.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha<Livro> pilha = new Pilha<>(20);

        // Cria os livros de maneira dinamica
        criaLivros(5, pilha);

        int opcao = 1;
        while (opcao != 0) {
            opcao = criaMenu(sc);

            switch (opcao) {
                case 1:
                    adicionaLivroNaPilha(sc, pilha);
                    break;
                case 2:
                    removeLivroDaPilha(pilha);
                    break;
                case 3:
                    verificaUltimo(pilha);
                    break;
                case 4:
                    verificaTamanhoTotalPilha(pilha);
                    break;
                case 5:
                    imprimirPilha(pilha);
                    break;
                case 6:
                    verificarPilhaVazia(pilha);
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }

    private static void verificarPilhaVazia(Pilha<Livro> pilha) {
        System.out.println(pilha.estaVazia());
    }

    private static void imprimirPilha(Pilha<Livro> pilha) {
        System.out.println("Imprimindo pilha...");
        System.out.println(pilha);
    }

    private static void verificaTamanhoTotalPilha(Pilha<Livro> pilha) {
        System.out.println("Tamanho total da pilha: " + pilha.tamanho());
    }

    private static void verificaUltimo(Pilha<Livro> pilha) {
        System.out.println("Último livro inserido na pilha: " + pilha.espia());
    }

    private static void removeLivroDaPilha(Pilha<Livro> pilha) {
        System.out.println("Livro removido: " + pilha.desempilha());
        if (pilha.desempilha() == null) {
            System.out.println("Pilha vazia...");
        }
    }

    private static void adicionaLivroNaPilha(Scanner sc, Pilha<Livro> pilha) {
        System.out.println("Adicionando livro na pilha, entre com as informações!");

        System.out.print("Entre com o nome do livro: ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.print("Entre com o nome do autor:");
        String autor = sc.nextLine();
        System.out.print("Entre com o ano de lançamento (DD/MM/YYYY): ");
        String anoLancamento = sc.nextLine();
        System.out.print("Informe o ISBN: ");
        Integer isbn = sc.nextInt();

        Livro livro = new Livro(nome, autor, isbn, anoLancamento);

        try {
            pilha.empilha(livro);
            System.out.println("Livro adicionado com sucesso!");
            System.out.println(pilha);

        } catch (Exception e) {
            System.out.println("Livro não adicionado, tente novamente!");
        }
    }

    protected static void criaLivros(int quantidade, Pilha<Livro> pilha) {
        Livro livro;
        for (int i = 0; i < quantidade; i++) {

            livro = new Livro();
            livro.setNome("Livro" + i);
            livro.setAutor("AutorLivro" + i);
            livro.setIsbn(12345678 + i);
            livro.setAnoLancamento(i + "/02/202" + i);

            pilha.empilha(livro);
        }
    }

    protected static int criaMenu(Scanner sc) {

        boolean entradaValida = false;
        int opcao = 0;
        while (!entradaValida) {
            System.out.println("Escolha uma opção");
            System.out.println("1. Adicionar Livro na pilha.");
            System.out.println("2. Remova um Livro da pilha.");
            System.out.println("3. Verificar o último livro inserido na pilha.");
            System.out.println("4. Verificar o tamanho total da pilha.");
            System.out.println("5. Verificar se a pilha está vazia.");
            System.out.println("6. Imprimir a pilha.");
            System.out.println("0. Sair.");

            System.out.print("Opção: ");
            opcao = sc.nextInt();

            try {
                if (opcao >= 0 && opcao < 6) {
                    entradaValida = true;
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Valor inválido, tente novamente!");
            }
        }
        return opcao;
    }
}
