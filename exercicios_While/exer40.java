package exercicios_While;

import java.util.Scanner;

public class exer40 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int num = scanner.nextInt();
	        int i = 1;
	        while (i <= 10) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	            i++;
	        }
	        scanner.close();
	    }
	}