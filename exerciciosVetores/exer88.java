package exerciciosVetores;

import java.util.Scanner;

public class exer88 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int somaPares = 0, somaImpares = 0;
        int contagemPares = 0, contagemImpares = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contagemPares++;
            } else {
                somaImpares += numeros[i];
                contagemImpares++;
            }
        }
        
        double mediaPares = contagemPares > 0 ? (double) somaPares / contagemPares : 0;
        double mediaImpares = contagemImpares > 0 ? (double) somaImpares / contagemImpares : 0;
        
        System.out.println("Média dos valores pares: " + mediaPares);
        System.out.println("Média dos valores ímpares: " + mediaImpares);
        
        scanner.close();
    }
}
