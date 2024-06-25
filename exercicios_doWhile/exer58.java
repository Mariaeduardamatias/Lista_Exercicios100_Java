package exercicios_doWhile;

import java.util.Scanner;

public class exer58 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite um número inteiro: ");
		        int num = scanner.nextInt();
		        int a = 0, b = 1, c;
		        System.out.print(a + " " + b);
		        do {
		            c = a + b;
		            if (c > num) break;
		            System.out.print(" " + c);
		            a = b;
		            b = c;
		        } while (true);
		        System.out.println();
		        scanner.close();
		    }
		}
