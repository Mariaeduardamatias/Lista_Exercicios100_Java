package exercicios_doWhile;

import java.util.Scanner;

public class exer61 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um n�mero inteiro: ");
		        int num = scanner.nextInt();
		        int soma = 0;
		        int i = 1;
		        do {
		            if (i % 2 == 0) {
		                soma += i;
		            }
		            i++;
		        } while (i <= num);
		        System.out.println("A soma dos n�meros pares entre 1 e " + num + " �: " + soma);
		        scanner.close();
		    }
		}
