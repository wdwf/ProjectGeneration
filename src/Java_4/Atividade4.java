package Java_4;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferencaProduto;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1° numero: ");
		n1 = input.nextFloat();
		System.out.print("Digite o 2° numero: ");
		n2 = input.nextFloat();
		System.out.print("Digite o 3° numero: ");
		n3 = input.nextFloat();
		System.out.print("Digite o 4° numero: ");
		n4 = input.nextFloat();
		diferencaProduto = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença do produto é: %.1f", diferencaProduto);
		
		input.close();
	}
}
