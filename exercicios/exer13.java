package exercicios;

import java.util.Scanner;

public class exer13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura dos dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Verificação se o primeiro número é múltiplo do segundo
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " é múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        }

        scanner.close();
    }
}