package exerciciosVetores;

import java.util.Scanner;

public class exer83 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[7];
	        int soma = 0;
	        
	        for (int i = 0; i < 7; i++) {
	            System.out.print("Digite um número: ");
	            numeros[i] = scanner.nextInt();
	            soma += numeros[i];
	        }
	        
	        double media = soma / 7.0;
	        System.out.println("A média aritmética é: " + media);
	        
	        scanner.close();
	    }
	}