package br.jean;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a, b;
		
		System.out.println("Digite dois numeros:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		while (a != b) {
			if (a < b) {
				System.out.println("CRESCENTE!");
			}
			else {
				System.out.println("DECRESCENTE!");
			}
			
			System.out.println("Digite outros dois numeros:");
			a = sc.nextInt();
			b = sc.nextInt();
		}
	}

}
