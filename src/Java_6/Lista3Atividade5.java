package Java_6;

import java.util.Scanner;

public class Lista3Atividade5 {
	public static void main(String[] args) {
		int numero;
		int[] contador = { 0 };

		Scanner input = new Scanner(System.in);

		do {
			numero = lerNumero(input);

			if (numero == 0) {
				break;
			}

			contadorNumerosPositivos(numero, contador);

		} while (true);

		System.out.printf("A soma dos números positivos é: %d", contador[0]);

		input.close();

	}

	public static int lerNumero(Scanner input) {
		while (true) {
			try {
				System.out.print("Digite o número (Obs: O número 0 finaliza o programa):");
				return input.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada inválida. Digite um número inteiro.");
				input.nextLine();
			}
		}
	}

	public static void contadorNumerosPositivos(int numero, int[] contador) {
		if (numero > 0) {
			contador[0] += numero;
		}
	}
}
