package exercicios_While;

import java.util.Scanner;

public class exer48 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número inteiro: ");
		        int num = scanner.nextInt();
		        int n = num;
		        while (n != 0) {
		            int digito = n % 10;
		            System.out.println(digito);
		            n /= 10;
		        }
		        scanner.close();
		    }
		}
