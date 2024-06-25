package exercicios;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do número inteiro
        System.out.print("Digite um número inteiro para exibir a tabuada: ");
        int numero = scanner.nextInt();

        // Exibição da tabuada até o décimo valor
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}