package exercicios;

import java.util.Scanner;

public class exer9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do valor do depósito mensal e da taxa de juros mensal
        System.out.print("Digite o valor do depósito mensal: R$ ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJurosMensal = scanner.nextDouble() / 100; // convertendo para decimal

        // Cálculo do montante após 12 meses
        double montante = 0;
        for (int i = 0; i < 12; i++) {
            montante = (montante + depositoMensal) * (1 + taxaJurosMensal);
        }

        // Exibição do resultado
        System.out.println("Montante após 12 meses: R$ " + montante);

        scanner.close();
    }
}
