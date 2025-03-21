package Java_7;
import java.util.Arrays;

public class Lista2Atividade3 {
	public static void main(String[] args) {
		//A resolução segue a logica de que essa matriz vai ser sempre 3x3 (3 linhas, 3 colunas)
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] elementosDiagonalPrincipal = new int[3];
		int[] elementosDiagonalSecundaria = new int[3];
		int[] somaDiagonalPrincipal = new int[1];
		int[] somaDiagonalSecundaria = new int[1];
		
		exibirElementosDiagonalPrincipal(matriz, elementosDiagonalPrincipal);
		exibirElementosDiagonalSecundaria(matriz, elementosDiagonalSecundaria);
		exibirSomaElementosDiagonalPrincipal(elementosDiagonalPrincipal, somaDiagonalPrincipal);
		exibirSomaElementosDiagonalSecundaria(elementosDiagonalSecundaria, somaDiagonalSecundaria);
		
		System.out.println();
	}
	
	public static void exibirElementosDiagonalPrincipal(int[][] matriz, int[] elementosDiagonalPrincipal) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2)) {
					elementosDiagonalPrincipal[i] = matriz[i][j];
				}
			}
		}
		
		System.out.println("Elementos da Diagonal Principal: " + Arrays.toString(elementosDiagonalPrincipal));
	}

	public static void exibirElementosDiagonalSecundaria(int[][] matriz, int[] elementosDiagonalSecundaria) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
					elementosDiagonalSecundaria[i] = matriz[i][j];
				}
			}
		}
		
		System.out.println("Elementos da Diagonal Secundária: " + Arrays.toString(elementosDiagonalSecundaria));
	}

	public static void exibirSomaElementosDiagonalPrincipal(int[] elementosDiagonalPrincipal, int[] somaDiagonalPrincipal) {
		for (int numero : elementosDiagonalPrincipal) {
			somaDiagonalPrincipal[0] += numero;
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal[0]);
	}

	public static void exibirSomaElementosDiagonalSecundaria(int[] elementosDiagonalSecundaria, int[] somaDiagonalSecundaria) {
		for (int numero : elementosDiagonalSecundaria) {
			somaDiagonalSecundaria[0] += numero;
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalSecundaria[0]);
	}
}
