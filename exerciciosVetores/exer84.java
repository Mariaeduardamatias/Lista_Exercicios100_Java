package exerciciosVetores;

import java.util.Scanner;

public class exer84 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int contagemPares = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                contagemPares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + contagemPares);
        
        scanner.close();
    }
}
