package exercicios_doWhile;

import java.util.Scanner;

public class exer59 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        int i = 0;
		        int soma = 0;
		        do {
		            System.out.print("Digite a idade da pessoa: ");
		            int idade = scanner.nextInt();
		            soma += idade;
		            i++;
		        } while (i < 5);
		        double media = soma / 5.0;
		        System.out.println("A média das idades é: " + media);
		        scanner.close();
		    }
		}
