package Java_5;

import java.util.Scanner;

/*
 * Escreva um algoritmo em Java, que leia um número inteiro via teclado e 
 * mostre na tela uma mensagem indicando se este número é par ou ímpar e
 * se o número é positivo ou negativo.
 * 
 * posivel entrada: 2
 * saida esperada: "O numero 2 é par e positivo!"
 * */

public class Lista1Atividade2 {
	public static void main(String[] args) {
		int num;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		num = input.nextInt();

		if (num % 2 == 0 && num > 0) {
			System.out.printf("O Número %d é par e positivo", num);
		} else if (num % 2 == 0 && num < 0) {
			System.out.printf("O Número %d é par e negativo", num);
		} else if (num > 0) {
			System.out.printf("O Número %d é impar e positivo", num);
		} else if (num < 0) {
			System.out.printf("O Número %d é impar e negativo", num);
		} else {
			System.out.printf("O Número %d é igual a 0", num);
		}

		input.close();
	}
}
