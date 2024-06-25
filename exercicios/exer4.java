package exercicios;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Leitura das notas
	        System.out.print("Digite a primeira nota (peso 2): ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota (peso 3): ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota (peso 5): ");
	        double nota3 = scanner.nextDouble();

	        // Cálculo da média ponderada
	        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);

	        // Exibição do resultado
	        System.out.println("Média ponderada: " + media);

	        scanner.close();
	    }

}
