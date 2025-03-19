package Java_5;

import java.util.Scanner;

/*
 * Exercicio: Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e 
 * imprima na tela se a soma de A + B é maior, menor ou igual a C.
 * */

public class Lista1Atividade1 {
	public static void main(String[] args) {
		int numA, numB, numC, soma;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o numero A: ");
		numA = input.nextInt();
		
		System.out.print("Digite o numero B: ");
		numB = input.nextInt();
		
		System.out.print("Digite o numero C: ");
		numC = input.nextInt();
		
		soma = numA + numB;
		
		if (soma > numC) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < numC) {
			System.out.println("A Soma  de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		input.close();
	}
}
