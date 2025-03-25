package Java_9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        int opcao;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("********************************");
            System.out.println("1 - Adicionar Cliente na fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da fila");
            System.out.println("0 - Sair");
            System.out.println("********************************");
            opcao = lerNumero(input);
            input.skip("\\R?");

            if (opcao == 0) {
                System.out.println("Programa Finalizado!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    fila.add(input.nextLine());
                    System.out.println("\nFila:\n");
                    listarClientes(fila);
                    System.out.println("\nCliente Adicionado!\n");
                    break;
                case 2:
                    System.out.println("\nLista de Clientes na Fila:\n");
                    listarClientes(fila);
                    System.out.println("\n");
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia.\n");
                        break;
                    }
                    fila.remove();
                    System.out.println("\nFila:\n");
                    listarClientes(fila);
                    System.out.println("\nO Cliente foi Chamado!\n");
                    break;
                default:
                    System.out.println("\nOpção inválida.\n");
                    break;
            }
        }

        input.close();
    }

    public static void listarClientes(Queue<String> fila) {
        Iterator<String> iterator = fila.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static int lerNumero(Scanner input) {
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