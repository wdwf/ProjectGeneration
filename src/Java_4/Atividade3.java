package Java_4;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
		float salarioBruto, adicionaNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o sálario bruto: ");
		salarioBruto = input.nextFloat();
		System.out.print("Digite o adiciona noturno: ");
		adicionaNoturno = input.nextFloat();
		System.out.print("Digite as horas Extras: ");
		horasExtras = input.nextFloat();
		System.out.print("Digite o desconto: ");
		descontos = input.nextFloat();
		
		salarioLiquido = salarioBruto + adicionaNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O salario liquido é: %.2f", salarioLiquido);
		
		input.close();
	}
}
