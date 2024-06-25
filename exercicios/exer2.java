package exercicios;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	        // Leitura do raio
	        System.out.print("Digite o raio do círculo: ");
	        double raio = scanner.nextDouble();

	        // Cálculo da área e do perímetro
	        double area = Math.PI * raio * raio;
	        double perimetro = 2 * Math.PI * raio;

	        // Exibição dos resultados
	        System.out.println("Área do círculo: " + area);
	        System.out.println("Perímetro do círculo: " + perimetro);

	        scanner.close();
	    }
}
