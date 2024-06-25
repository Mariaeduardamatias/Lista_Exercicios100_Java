package exercicios_For;

import java.util.Scanner;

public class exer72 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Digite um número inteiro: ");
	        int num = scanner.nextInt();
	        boolean ehPrimo = true;
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                ehPrimo = false;
	                break;
	            }
	        }
	        if (ehPrimo && num > 1) {
	            System.out.println(num + " é um número primo.");
	        } else {
	            System.out.println(num + " não é um número primo.");
	        }
	        scanner.close();
	    }
	}