package exercicios;

import java.util.Scanner;

public class exer35 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro n�mero inteiro: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Digite o segundo n�mero inteiro: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Digite o terceiro n�mero inteiro: ");
	        int num3 = scanner.nextInt();

	        double media = (num1 + num2 + num3) / 3.0;

	        System.out.println("M�dia aritm�tica: " + media);

	        if (media >= 7) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }

	        scanner.close();
	    }
	}