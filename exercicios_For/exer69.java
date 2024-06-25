package exercicios_For;

import java.util.Scanner;

public class exer69 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
	        int soma = 0;
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite um número inteiro: ");
	            int num = scanner.nextInt();
	            soma += num;
	        }
	        double media = soma / 5.0;
	        System.out.println("A média aritmética é: " + media);
	        scanner.close();
	    }
	}