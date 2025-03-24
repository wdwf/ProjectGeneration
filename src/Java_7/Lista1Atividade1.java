package Java_7;

import java.util.Scanner;

public class Lista1Atividade1 {
	public static void main(String[] args) {
		int[] vetorListaValores = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numeroProcurado;
		int[] indice = new int[1];
		boolean validaIndice = false;

		Scanner input = new Scanner(System.in);
		
		numeroProcurado = validaEntrada(input);
		validaIndice = procuraValor(numeroProcurado, indice, vetorListaValores);
		
		if (validaIndice) {
			System.out.printf("O número %d está localizado na posição: %d",numeroProcurado, indice[0]);
		} else {
			System.out.printf("O número %d não foi encontrado!", numeroProcurado);
		}

		input.close();

	}

	public static int validaEntrada(Scanner input) {
		while (true) {
			try {
				System.out.print("Digite o número que você deseja encontrar:");
				return input.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada inválida. Digite um número inteiro.");
				input.nextLine();
			}
		}
	}

	public static boolean procuraValor(int valorProcurado, int[] indice, int[] vetorListaValores) {
		boolean valorFoiEncontrado = false;
		
		for (int i = 0; i < vetorListaValores.length; i++) {
			if (vetorListaValores[i] == valorProcurado) {
				indice[0] = i;
				valorFoiEncontrado = true;
				break;
			}
		}
		return valorFoiEncontrado;

	}
}
