package Java_4;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, calculaMedia;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		nota1 = input.nextFloat();
		System.out.print("Digite a nota 2: ");
		nota2 = input.nextFloat();
		System.out.print("Digite a nota 3: ");
		nota3 = input.nextFloat();
		System.out.print("Digite a nota 4: ");
		nota4 = input.nextFloat();
		
		calculaMedia = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A média final é: %.1f", calculaMedia);
		
		input.close();
	}
}
