package exercicios;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do n�mero inteiro
        System.out.print("Digite um n�mero inteiro para exibir a tabuada: ");
        int numero = scanner.nextInt();

        // Exibi��o da tabuada at� o d�cimo valor
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}