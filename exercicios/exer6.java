package exercicios;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do número inteiro
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        // Verificação se o número é par ou ímpar
	        if (numero % 2 == 0) {
	            System.out.println(numero + " é um número PAR.");
	        } else {
	            System.out.println(numero + " é um número ÍMPAR.");
	        }

	        scanner.close();
	    }
	}