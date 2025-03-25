package Java_9;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();
        int opcao;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("********************************");
            System.out.println("1 - Adicionar Livro na pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("********************************");
            opcao = validaOpcao(input);
            input.skip("\\R?");

            if (opcao == 0) {
                System.out.println("Programa Finalizado!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o titulo do livro: ");
                    pilha.push(input.nextLine());
                    System.out.println("\nPilha:\n");
                    listarLivros(pilha);
                    System.out.println("\nLivro Adicionado!\n");
                    break;
                case 2:
                    System.out.println("\nLista de Livros na Pilha:\n");
                    listarLivros(pilha);
                    System.out.println("\n");
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia.\n");
                        break;
                    }
                    pilha.pop();
                    System.out.println("\nPilha:\n");
                    listarLivros(pilha);
                    System.out.println("\nO Livro foi retirado da pilha!\n");
                    break;
                default:
                    System.out.println("\nOpção inválida.\n");
                    break;
            }
        }

        input.close();
    }

    public static void listarLivros(Stack<String> pilha) {
        Iterator<String> iterator = pilha.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static int validaOpcao(Scanner input) {
        while (true) {
            try {
                System.out.print("Entre com a opção desejada: ");
                return input.nextInt();
            } catch (Exception e) {
                System.out.println("\nEntrada inválida. Digite uma opção de acordo com o menu.\n");
                input.nextLine();
            }
        }
    }
}
