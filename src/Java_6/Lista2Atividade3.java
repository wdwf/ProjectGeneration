package Java_6;

import java.util.Scanner;

public class Lista2Atividade3 {
	public static void main(String[] args) {
		int[] contador = { 0, 0 };
		int idade;

		Scanner input = new Scanner(System.in);

		while (true) {
			idade = lerIdade(input);

			if (idade < 0) {
				break;
			}

			contadorIdades(idade, contador);
		}

		System.out.println("Total de pessoas com menos de 21 anos: " + contador[0]);
		System.out.println("Total de pessoas com mais de 50 anos: " + contador[1]);

		input.close();
	}

	public static int lerIdade(Scanner input) {
		while (true) {
			try {
				System.out.print("Digite a idade desejada (Obs: Número negativo finaliza o programa):");
				return input.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada inválida. Digite um número inteiro.");
				input.nextLine();
			}
		}
	}

	public static void contadorIdades(int idade, int[] contador) {
		if (idade < 21) {
			contador[0]++;
		} else if (idade > 50) {
			contador[1]++;
		}
	}
}
