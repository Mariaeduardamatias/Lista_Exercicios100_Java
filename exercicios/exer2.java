package exercicios;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	        // Leitura do raio
	        System.out.print("Digite o raio do c�rculo: ");
	        double raio = scanner.nextDouble();

	        // C�lculo da �rea e do per�metro
	        double area = Math.PI * raio * raio;
	        double perimetro = 2 * Math.PI * raio;

	        // Exibi��o dos resultados
	        System.out.println("�rea do c�rculo: " + area);
	        System.out.println("Per�metro do c�rculo: " + perimetro);

	        scanner.close();
	    }
}
