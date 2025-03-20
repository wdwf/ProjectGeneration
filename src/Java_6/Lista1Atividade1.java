package Java_6;

import java.util.Scanner;

/*
 * Exercicio: Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
 * onde o primeiro número deve ser menor do que o segundo número. Caso contrário, 
 * deve ser exibida uma mensagem na tela informando que o intervalo é inválido e 
 * sair do programa. No intervalo informado, mostre na tela todes os números que 
 * são múltiplos de 3 e 5.
 * */

public class Lista1Atividade1 {
	public static void main(String[] args) {
		int primeiroNumero, segundoNumero;

		Scanner input = new Scanner(System.in);

		try {
			primeiroNumero = lerNumero("Digite o primeiro número: ", input);
			segundoNumero = lerNumero("Digite o segundo número sendo ele maior que o primeiro: ", input);

			validacaoDeIntervalo(primeiroNumero, segundoNumero);
			mostrarMultiplos(primeiroNumero, segundoNumero);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			input.close();
		}
	}

	public static int lerNumero(String mensagem, Scanner input) {
		while (true) {
			try {
				System.out.print(mensagem);
				return input.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada inválida. Digite um número inteiro.");
				input.nextLine();
			}
		}
	}

	public static void validacaoDeIntervalo(int primeiroNumero, int segundoNumero) {
		if (primeiroNumero >= segundoNumero) {
			throw new ArithmeticException("Intervalo inválido.");
		}
	}

	public static void mostrarMultiplos(int primeiroNumero, int segundoNumero) {
		System.out.printf("No intervalo entre %d e %d:\n", primeiroNumero, segundoNumero);
		for (int i = primeiroNumero; i <= segundoNumero; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5");
			}
		}
	}
}
