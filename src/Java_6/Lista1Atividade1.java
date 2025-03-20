package Java_6;

import java.util.Scanner;

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

	public static void validacaoDeIntervalo(int num1, int num2) {
		if (num1 >= num2) {
			throw new ArithmeticException("Intervalo inválido.");
		}
	}

	public static void mostrarMultiplos(int num1, int num2) {
		System.out.printf("No intervalo entre %d e %d:\n", num1, num2);
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5");
			}
		}
	}
}
