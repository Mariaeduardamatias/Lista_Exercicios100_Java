package exercicios_While;

import java.util.Scanner;

public class exer44 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int i = 0;
		        int soma = 0;
		        while (i < 5) {
		            System.out.print("Digite a idade da pessoa: ");
		            int idade = scanner.nextInt();
		            soma += idade;
		            i++;
		        }
		        double media = soma / 5.0;
		        System.out.println("A média das idades é: " + media);
		        scanner.close();
		    }
		}
