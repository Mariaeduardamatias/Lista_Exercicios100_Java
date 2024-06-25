package exercicios;

import java.util.Scanner;

public class exer8 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Leitura dos dois números inteiros
	        System.out.print("Digite o primeiro número inteiro: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número inteiro: ");
	        int numero2 = scanner.nextInt();

	        // Troca dos valores
	        int temp = numero1;
	        numero1 = numero2;
	        numero2 = temp;

	        // Exibição dos números trocados
	        System.out.println("Valor do primeiro número após troca: " + numero1);
	        System.out.println("Valor do segundo número após troca: " + numero2);

	        scanner.close();
	    }
	}