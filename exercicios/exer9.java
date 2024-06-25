package exercicios;

import java.util.Scanner;

public class exer9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do valor do dep�sito mensal e da taxa de juros mensal
        System.out.print("Digite o valor do dep�sito mensal: R$ ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJurosMensal = scanner.nextDouble() / 100; // convertendo para decimal

        // C�lculo do montante ap�s 12 meses
        double montante = 0;
        for (int i = 0; i < 12; i++) {
            montante = (montante + depositoMensal) * (1 + taxaJurosMensal);
        }

        // Exibi��o do resultado
        System.out.println("Montante ap�s 12 meses: R$ " + montante);

        scanner.close();
    }
}
