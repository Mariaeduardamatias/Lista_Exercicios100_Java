package exerciciosVetores;

import java.util.Scanner;

public class exer87 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10];
	        int contagemPositivos = 0;
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite um número: ");
	            numeros[i] = scanner.nextInt();
	            if (numeros[i] > 0) {
	                contagemPositivos++;
	            }
	        }
	        
	        System.out.println("Quantidade de números positivos: " + contagemPositivos);
	        
	        scanner.close();
	    }
	}