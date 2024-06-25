package exercicios_For;

import java.util.Scanner;

public class exer73 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int num = scanner.nextInt();
	        int a = 0, b = 1, c;
	        System.out.print(a + " " + b);
	        for (int i = 2; ; i++) {
	            c = a + b;
	            if (c > num) break;
	            System.out.print(" " + c);
	            a = b;
	            b = c;
	        }
	        System.out.println();
	        scanner.close();
	    }
	}