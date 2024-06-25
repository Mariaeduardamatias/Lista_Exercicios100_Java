package exercicios_doWhile;

import java.util.Scanner;

public class exer54 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        int i = 0;
		        int soma = 0;
		        do {
		            System.out.print("Digite um número inteiro: ");
		            int num = scanner.nextInt();
		            soma += num;
		            i++;
		        } while (i < 5);
		        double media = soma / 5.0;
		        System.out.println("A média aritmética é: " + media);
		        scanner.close();
		    }
		}
