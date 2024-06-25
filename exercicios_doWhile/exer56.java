package exercicios_doWhile;

import java.util.Scanner;

public class exer56 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número inteiro positivo: ");
		        int num = scanner.nextInt();
		        int i = 1;
		        do {
		            if (num % i == 0) {
		                System.out.println(i);
		            }
		            i++;
		        } while (i <= num);
		        scanner.close();
		    }
		}
