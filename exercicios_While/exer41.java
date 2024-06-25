package exercicios_While;

import java.util.Scanner;

public class exer41 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número inteiro positivo: ");
		        int num = scanner.nextInt();
		        int i = 1;
		        while (i <= num) {
		            if (num % i == 0) {
		                System.out.println(i);
		            }
		            i++;
		        }
		        scanner.close();
		    }
		}
