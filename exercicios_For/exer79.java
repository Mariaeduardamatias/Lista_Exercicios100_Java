package exercicios_For;

import java.util.Scanner;

public class exer79 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um n�mero inteiro: ");
	        int num = scanner.nextInt();
	        String numStr = Integer.toString(num);
	        for (int i = 0; i < numStr.length(); i++) {
	            System.out.println(numStr.charAt(i));
	        }
	        scanner.close();
	    }
	}