package br.jean;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int i, n;
		double soma = 0, media;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
		}
		
		System.out.println();
		System.out.print("Valores: ");
		for (i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		media = soma / n;
		
		System.out.println("MEDIA = " + String.format("%.2f", media));
	}

}
