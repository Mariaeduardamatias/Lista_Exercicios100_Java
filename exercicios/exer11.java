package exercicios;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura dos três números reais
	        System.out.print("Digite o primeiro número real: ");
	        double numero1 = scanner.nextDouble();

	        System.out.print("Digite o segundo número real: ");
	        double numero2 = scanner.nextDouble();

	        System.out.print("Digite o terceiro número real: ");
	        double numero3 = scanner.nextDouble();

	        // Cálculo da média aritmética
	        double media = (numero1 + numero2 + numero3) / 3;

	        // Exibição do resultado
	        System.out.println("Média aritmética: " + media);

	        scanner.close();
	    }
	}