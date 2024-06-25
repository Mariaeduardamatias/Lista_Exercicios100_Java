package exercicios;

import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do salário base
	        System.out.print("Digite o salário base do funcionário: R$ ");
	        double salarioBase = scanner.nextDouble();

	        // Cálculo do salário líquido com 5% de comissão
	        double comissao = salarioBase * 0.05;
	        double salarioLiquido = salarioBase + comissao;

	        // Exibição do resultado
	        System.out.println("Salário base: R$ " + salarioBase);
	        System.out.println("Comissão (5%): R$ " + comissao);
	        System.out.println("Salário líquido: R$ " + salarioLiquido);

	        scanner.close();
	    }
}