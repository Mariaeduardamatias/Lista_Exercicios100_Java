package exerciciosVetores;

import java.util.Scanner;

public class exer82 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        int[] numeros = new int[10];
        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        
        System.out.println("A soma dos números é: " + soma);
        
        scanner.close();
    }
}