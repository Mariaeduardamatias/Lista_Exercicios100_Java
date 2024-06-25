package exercicios_doWhile;

import java.util.Scanner;

public class exer64 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite um número inteiro: ");
		        int num = scanner.nextInt();
		        int fatorial = 1;
		        int i = 1;
		        do {
		            fatorial *= i;
		            i++;
		        } while (i <= num);
		        System.out.println("O fatorial de " + num + " é: " + fatorial);
		        scanner.close();
		    }
		}
