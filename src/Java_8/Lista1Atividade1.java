package Java_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1Atividade1 {
    public static void main(String[] args) {
        ArrayList<String> listaCores = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        while (listaCores.size() < 5) {
            listaCores.add(lerValor(input, listaCores.size()));
        }

        System.out.println("\nListar todas as cores:\n");

        for (String cor : listaCores) {
            System.out.println(cor);
        }

        System.out.println("\nOrdenar as cores:\n");
        listaCores.sort(null);

        for (String cor : listaCores) {
            System.out.println(cor);
        }

        input.close();
    }

    public static String lerValor(Scanner input, int posicao) {
        System.out.print("Digite a " + (posicao + 1) + "° cor: ");
        return input.nextLine();
    }
}
