package br.jean;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n, i;
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] c = new int[n];
		int[] a = new int[n]; 
		int[] b = new int[n]; 
		
		
		System.out.println("Digite os valores do vetor A:");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("Valore resultante:");
		for (i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}

	}

}
