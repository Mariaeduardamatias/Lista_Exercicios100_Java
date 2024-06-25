package exercicios;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura dos números
	        System.out.print("Digite o primeiro número inteiro: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número inteiro: ");
	        int numero2 = scanner.nextInt();

	        // Operações matemáticas
	        int soma = numero1 + numero2;
	        int subtracao = numero1 - numero2;
	        int multiplicacao = numero1 * numero2;
	        // Verificação se o segundo número é diferente de zero para evitar divisão por zero
	        double divisao = numero2 != 0 ? (double) numero1 / numero2 : 0;

	        // Exibição dos resultados
	        System.out.println("Soma: " + soma);
	        System.out.println("Subtração: " + subtracao);
	        System.out.println("Multiplicação: " + multiplicacao);
	        System.out.println("Divisão: " + divisao);

	        scanner.close();
	    }
}
