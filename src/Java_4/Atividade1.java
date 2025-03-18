package Java_4;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		float salario, abono, valorTotal;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		salario = input.nextFloat();
		
		System.out.print("Digite o Abono: ");
		abono = input.nextFloat();
		
		valorTotal = salario + abono;
		
		System.out.printf("O seu novo salario é: %.2f", valorTotal);
		
		input.close();
	}
}
