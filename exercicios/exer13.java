package exercicios;

import java.util.Scanner;

public class exer13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura dos dois n�meros inteiros
        System.out.print("Digite o primeiro n�mero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int numero2 = scanner.nextInt();

        // Verifica��o se o primeiro n�mero � m�ltiplo do segundo
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " � m�ltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " n�o � m�ltiplo de " + numero2);
        }

        scanner.close();
    }
}