package exercicios;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        // Leitura da base e altura do triângulo
	        System.out.print("Digite a base do triângulo: ");
	        double base = scanner.nextDouble();

	        System.out.print("Digite a altura do triângulo: ");
	        double altura = scanner.nextDouble();

	        // Cálculo da área
	        double area = (base * altura) / 2;

	        // Exibição do resultado
	        System.out.println("Área do triângulo: " + area);

	        scanner.close();
	    }
}
