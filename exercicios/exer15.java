package exercicios;

import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do sal�rio atual
        System.out.print("Digite o sal�rio atual do funcion�rio: R$ ");
        double salarioAtual = scanner.nextDouble();

        // C�lculo do novo sal�rio com aumento de 15%
        double aumento = salarioAtual * 0.15;
        double novoSalario = salarioAtual + aumento;

        // Exibi��o do resultado
        System.out.println("Sal�rio atual: R$ " + salarioAtual);
        System.out.println("Aumento (15%): R$ " + aumento);
        System.out.println("Novo sal�rio: R$ " + novoSalario);

        scanner.close();
    }
}