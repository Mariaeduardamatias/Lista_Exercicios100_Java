package exercicios;

import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do sal�rio base
	        System.out.print("Digite o sal�rio base do funcion�rio: R$ ");
	        double salarioBase = scanner.nextDouble();

	        // C�lculo do sal�rio l�quido com 5% de comiss�o
	        double comissao = salarioBase * 0.05;
	        double salarioLiquido = salarioBase + comissao;

	        // Exibi��o do resultado
	        System.out.println("Sal�rio base: R$ " + salarioBase);
	        System.out.println("Comiss�o (5%): R$ " + comissao);
	        System.out.println("Sal�rio l�quido: R$ " + salarioLiquido);

	        scanner.close();
	    }
}