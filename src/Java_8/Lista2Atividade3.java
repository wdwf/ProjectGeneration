package Java_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Lista2Atividade3 {
    public static void main(String[] args) {
        HashSet<Integer> listaValores = new HashSet<Integer>();
        int contador = 0;
        int novoValor;
        Scanner input = new Scanner(System.in);

        while (contador < 10) {
            novoValor = verificarValor(input, contador);
            listaValores.add(novoValor);
            contador++;
        }

        System.out.println("\nListar dados do Set:\n");
        Iterator<Integer> iSetListaValores = listaValores.iterator();
        while (iSetListaValores.hasNext()) {
            System.out.println(iSetListaValores.next());
        }

        input.close();

    }

    public static int verificarValor(Scanner input, int posicao) {
        while (true) {
            try {
                System.out.print("Digite o " + (posicao + 1) + "° número: ");
                return input.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                input.nextLine();
            }
        }
    }
}
