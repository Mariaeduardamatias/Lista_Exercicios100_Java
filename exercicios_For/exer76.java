package exercicios_For;

import java.util.Scanner;

public class exer76 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int num = scanner.nextInt();
	        int soma = 0;
	        for (int i = 1; i <= num; i++) {
	            if (i % 2 == 0) {
	                soma += i;
	            }
	        }
	        System.out.println("A soma dos números pares entre 1 e " + num + " é: " + soma);
	        scanner.close();
	    }
	}