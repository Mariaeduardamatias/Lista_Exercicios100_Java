package exercicios;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do n�mero inteiro
	        System.out.print("Digite um n�mero inteiro: ");
	        int numero = scanner.nextInt();

	        // Verifica��o se o n�mero � par ou �mpar
	        if (numero % 2 == 0) {
	            System.out.println(numero + " � um n�mero PAR.");
	        } else {
	            System.out.println(numero + " � um n�mero �MPAR.");
	        }

	        scanner.close();
	    }
	}