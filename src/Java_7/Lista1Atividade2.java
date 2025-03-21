package Java_7;

import java.util.Scanner;

public class Lista1Atividade2 {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		int soma = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = lerNumero(input, i);
			soma += vetor[i];
		}

		System.out.println();
		exibeElementosIndiceImpares(vetor);
		System.out.println();
		exibeElementosPares(vetor);
		System.out.printf("\nSoma: %d", soma);
		System.out.printf("\nMédia: %.2f", (double) soma / vetor.length);

	}

	public static int lerNumero(Scanner input, int posicao) {
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

	public static void exibeElementosIndiceImpares(int[] vetor) {
		System.out.print("Elementos nos índices ímpares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (!(i % 2 == 0)) {
				System.out.printf("%d ", vetor[i]);
			}
		}
	}

	public static void exibeElementosPares(int[] vetor) {
		System.out.print("Elementos pares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
			}
		}
	}
}
