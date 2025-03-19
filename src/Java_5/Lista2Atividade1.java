package Java_5;

import java.util.Scanner;

/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o 
 * código de um item (número inteiro de 1 a 6) e a quantidade comprada 
 * deste item (número inteiro). A seguir, mostre na tela o valor total 
 * da conta e o nome do produto que foi comprado.
 * 	
 * | Código do Produto | Produto          | Preço Unitário |
*  |-------------------|-----------------|---------------|
*  | 1                | Cachorro Quente  | R$ 10.00      |
*  | 2                | X-Salada         | R$ 15.00      |
*  | 3                | X-Bacon          | R$ 18.00      |
*  | 4                | Bauru            | R$ 12.00      |
*  | 5                | Refrigerante     | R$ 8.00       |
*  | 6                | Suco de laranja  | R$ 13.00      |
 * 
 * 
 * - Entrada:
 *   2
 *   5
 * - Saida:
 *   Produto: X-Salada
 *   Valor total: R$ 75.00
 * */

public class Lista2Atividade1 {
	public static void main(String[] args) {
		int num, quantidade;
		String produtoSelecionado = null;
		double valorTotal = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("------------------ MENU ------------------");
		System.out.println(" 1 - Cachorro Quente");
		System.out.println(" 2 - X-Salada");
		System.out.println(" 3 - X-Bacon");
		System.out.println(" 4 - Bauru");
		System.out.println(" 5 - Refrigerante");
		System.out.println(" 6 - Suco de laranja");
		System.out.println("------------------ ---- ------------------");
		System.out.print("Digite o codigo do produto desejado (De 1 a 6): ");
		num = input.nextInt();
		
		switch (num) {
		case 1: 
			produtoSelecionado = "Cachorro Quente";
			System.out.printf("Quantos %s você deseja comprar (numeros sem virgula ou ponto): ", produtoSelecionado);
			quantidade = input.nextInt();
			valorTotal = quantidade * 10.00;
			System.out.printf("Produto: %s \nValor total: R$ %.2f", produtoSelecionado, valorTotal);
			break;
		case 2: 
			produtoSelecionado = "X-Salada";
			System.out.printf("Quantos %s você deseja comprar (numeros sem virgula ou ponto): ", produtoSelecionado);
			quantidade = input.nextInt();
			valorTotal = quantidade * 15.00;
			System.out.printf("Produto: %s \nValor total: R$ %.2f", produtoSelecionado, valorTotal);
			break;
		case 3: 
			produtoSelecionado = "X-Bacon";
			System.out.printf("Quantos %s você deseja comprar (numeros sem virgula ou ponto): ", produtoSelecionado);
			quantidade = input.nextInt();
			valorTotal = quantidade * 18.00;
			System.out.printf("Produto: %s \nValor total: R$ %.2f", produtoSelecionado, valorTotal);
			break;
		case 4: 
			produtoSelecionado = "Bauru";
			System.out.printf("Quantos %s você deseja comprar (numeros sem virgula ou ponto): ", produtoSelecionado);
			quantidade = input.nextInt();
			valorTotal = quantidade * 12.00;
			System.out.printf("Produto: %s \nValor total: R$ %.2f", produtoSelecionado, valorTotal);
			break;
		case 5: 
			produtoSelecionado = "Refrigerante";
			System.out.printf("Quantos %s você deseja comprar (numeros sem virgula ou ponto): ", produtoSelecionado);
			quantidade = input.nextInt();
			valorTotal = quantidade * 8.00;
			System.out.printf("Produto: %s \nValor total: R$ %.2f", produtoSelecionado, valorTotal);
			break;
		case 6: 
			produtoSelecionado = "Suco de laranja";
			System.out.printf("Quantos %s você deseja comprar (numeros sem virgula ou ponto): ", produtoSelecionado);
			quantidade = input.nextInt();
			valorTotal = quantidade * 13.00;
			System.out.printf("Produto: %s \nValor total: R$ %.2f", produtoSelecionado, valorTotal);
			break;
		default:
			System.out.println("Produto não localizado...");
		}
		
		input.close();
	}
}