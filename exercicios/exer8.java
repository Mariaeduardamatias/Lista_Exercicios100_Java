package exercicios;

import java.util.Scanner;

public class exer8 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Leitura dos dois n�meros inteiros
	        System.out.print("Digite o primeiro n�mero inteiro: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo n�mero inteiro: ");
	        int numero2 = scanner.nextInt();

	        // Troca dos valores
	        int temp = numero1;
	        numero1 = numero2;
	        numero2 = temp;

	        // Exibi��o dos n�meros trocados
	        System.out.println("Valor do primeiro n�mero ap�s troca: " + numero1);
	        System.out.println("Valor do segundo n�mero ap�s troca: " + numero2);

	        scanner.close();
	    }
	}