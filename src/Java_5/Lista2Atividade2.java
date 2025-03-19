package Java_5;

import java.util.Scanner;

/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o 
 * Nome do Colaborador (String), o Código do Cargo do Colaborador 
 * (número inteiro de 1 a 6) e o Salário (número float). A seguir, 
 * mostre na tela o Nome do Colaborador, o Cargo e o novo Salário 
 * reajustado.
 * 
 *  | Código do Cargo| Cargo           | Percentual do Reajuste |
 *  |----------------|-----------------|-----------------------|
 *  | 1              | Gerente         | 10%                   |
 *  | 2              | Vendedor        | 7%                    |
 *  | 3              | Supervisor      | 9%                    |
 *  | 4              | Motorista       | 6%                    |
 *  | 5              | Estoquista      | 5%                    |
 *  | 6              | Técnico de TI   | 8%                    |
 *  
 *  - Possivel entrada: 
 *  João da Silva
 *  1
 *  10000.00
 *  - Saida esperada:
 *  Nome do colaborador: João da Silva
 *  Cargo: Gerente
 *  Salário: R$ 11000.00
 *  
 * */

public class Lista2Atividade2 {
	public static void main(String[] args) {
		String nomeColaborador, cargoSelecionado = null;
		int codigoCargo;
		float salarioAtual, salarioReajustado = 0.0f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome do colaborador: ");
		nomeColaborador = input.nextLine();
		
		System.out.println("\n\n------------------ Codigo - Cargo ------------------");
		System.out.println(" 1 - Gerente");
		System.out.println(" 2 - Vendedor");
		System.out.println(" 3 - Supervisor");
		System.out.println(" 4 - Motorista");
		System.out.println(" 5 - Estoquista");
		System.out.println(" 6 - Técnico de TI");
		System.out.println("------------------ ---- --------------------------------");
		System.out.print("Digite o codigo do produto desejado (De 1 a 6): ");
		codigoCargo = input.nextInt();
		
		switch (codigoCargo) {
		case 1: 
			cargoSelecionado = "Gerente";
			System.out.printf("Qual é o salario do cargo de %s Atualmente: ", cargoSelecionado);
			salarioAtual = input.nextFloat();
			salarioReajustado = (float) (salarioAtual + (0.10 * salarioAtual));
			break;
		case 2: 
			cargoSelecionado = "Vendedor";
			System.out.printf("Qual é o salario do cargo de %s Atualmente: ", cargoSelecionado);
			salarioAtual = input.nextFloat();
			salarioReajustado = (float) (salarioAtual + (0.07 * salarioAtual));
			break;
		case 3: 
			cargoSelecionado = "Supervisor";
			System.out.printf("Qual é o salario do cargo de %s Atualmente: ", cargoSelecionado);
			salarioAtual = input.nextFloat();
			salarioReajustado = (float) (salarioAtual + (0.09 * salarioAtual));
			break;
		case 4: 
			cargoSelecionado = "Motorista";
			System.out.printf("Qual é o salario do cargo de %s Atualmente: ", cargoSelecionado);
			salarioAtual = input.nextFloat();
			salarioReajustado = (float) (salarioAtual + (0.06 * salarioAtual));
			break;
		case 5: 
			cargoSelecionado = "Estoquista";
			System.out.printf("Qual é o salario do cargo de %s Atualmente: ", cargoSelecionado);
			salarioAtual = input.nextFloat();
			salarioReajustado = (float) (salarioAtual + (0.05 * salarioAtual));
			break;
		case 6: 
			cargoSelecionado = "Técnico de TI";
			System.out.printf("Qual é o salario do cargo de %s Atualmente: ", cargoSelecionado);
			salarioAtual = input.nextFloat();
			salarioReajustado = (float) (salarioAtual + (0.08 * salarioAtual));
			break;
		default:
			System.out.println("Cargo não localizado não localizado...");
		}
		
		System.out.printf("\n\nNome do colaborador: %s \nCargo: %s \nSalario Reajustado: R$ %.2f", nomeColaborador, cargoSelecionado, salarioReajustado);
		
		input.close();
	}
}
