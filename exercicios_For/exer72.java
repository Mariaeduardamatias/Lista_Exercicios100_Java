package exercicios_For;

import java.util.Scanner;

public class exer72 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Digite um n�mero inteiro: ");
	        int num = scanner.nextInt();
	        boolean ehPrimo = true;
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                ehPrimo = false;
	                break;
	            }
	        }
	        if (ehPrimo && num > 1) {
	            System.out.println(num + " � um n�mero primo.");
	        } else {
	            System.out.println(num + " n�o � um n�mero primo.");
	        }
	        scanner.close();
	    }
	}