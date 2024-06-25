package exercicios;

import java.util.Scanner;

public class exer21 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        int menores = 0;
	        int maiores = 0;
	        String continuar;

	        do {
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();

	            if (idade < 18) {
	                menores++;
	            } else {
	                maiores++;
	            }

	            System.out.print("Deseja continuar? (s/n): ");
	            continuar = scanner.next();
	        } while (continuar.equalsIgnoreCase("s"));

	        System.out.println("Total de menores de idade: " + menores);
	        System.out.println("Total de maiores de idade: " + maiores);

	        scanner.close();
	    }
	}