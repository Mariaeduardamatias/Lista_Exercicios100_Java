package exercicios_doWhile;

import java.util.Scanner;

public class exer63 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite um número inteiro: ");
		        int num = scanner.nextInt();
		        int n = num;
		        do {
		            int digito = n % 10;
		            System.out.println(digito);
		            n /= 10;
		        } while (n != 0);
		        scanner.close();
		    }
		}
