package br.jean;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		String nome1, nome2;
		double idade1, idade2, media;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		media = (double)(idade1 + idade2)/2;
		
		System.out.println("A idade de " + nome1 + " e " + nome2 + " eh de " + String.format("%.1f", media) + " anos");
		
		sc.close();

	}

}
