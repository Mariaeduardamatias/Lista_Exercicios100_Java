package exercicios;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        // Leitura da base e altura do tri�ngulo
	        System.out.print("Digite a base do tri�ngulo: ");
	        double base = scanner.nextDouble();

	        System.out.print("Digite a altura do tri�ngulo: ");
	        double altura = scanner.nextDouble();

	        // C�lculo da �rea
	        double area = (base * altura) / 2;

	        // Exibi��o do resultado
	        System.out.println("�rea do tri�ngulo: " + area);

	        scanner.close();
	    }
}
