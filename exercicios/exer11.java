package exercicios;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura dos tr�s n�meros reais
	        System.out.print("Digite o primeiro n�mero real: ");
	        double numero1 = scanner.nextDouble();

	        System.out.print("Digite o segundo n�mero real: ");
	        double numero2 = scanner.nextDouble();

	        System.out.print("Digite o terceiro n�mero real: ");
	        double numero3 = scanner.nextDouble();

	        // C�lculo da m�dia aritm�tica
	        double media = (numero1 + numero2 + numero3) / 3;

	        // Exibi��o do resultado
	        System.out.println("M�dia aritm�tica: " + media);

	        scanner.close();
	    }
	}