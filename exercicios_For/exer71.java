package exercicios_For;

import java.util.Scanner;

public class exer71 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro positivo: ");
	        int num = scanner.nextInt();
	        System.out.println("Divisores de " + num + ":");
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                System.out.println(i);
	            }
	        }
	        scanner.close();
	    }
	}