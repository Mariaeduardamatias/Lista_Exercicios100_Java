package exerciciosVetores;

import java.util.Arrays;
import java.util.Scanner;

public class exer86 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um n�mero: ");
            numeros[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeros);
        
        System.out.println("N�meros em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
        
        scanner.close();
    }
}

