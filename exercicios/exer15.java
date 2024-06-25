package exercicios;

import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do salário atual
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salarioAtual = scanner.nextDouble();

        // Cálculo do novo salário com aumento de 15%
        double aumento = salarioAtual * 0.15;
        double novoSalario = salarioAtual + aumento;

        // Exibição do resultado
        System.out.println("Salário atual: R$ " + salarioAtual);
        System.out.println("Aumento (15%): R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        scanner.close();
    }
}