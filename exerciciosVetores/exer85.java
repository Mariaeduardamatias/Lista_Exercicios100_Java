package exerciciosVetores;

import java.util.Scanner;

public class exer85 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        scanner.close();
    }
}