package br.jean;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n, i, j, negativos = 0;
		
		System.out.println("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
	
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					negativos = negativos + 1;
				}
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
		for (i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println("\nQUANTIADE DE NEGATIVOS: " + negativos);

	}

}
