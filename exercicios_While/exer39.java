package exercicios_While;

import java.util.Scanner;

public class exer39 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int i = 0;
		        int soma = 0;
		        while (i < 5) {
		            System.out.print("Digite um n�mero inteiro: ");
		            int num = scanner.nextInt();
		            soma += num;
		            i++;
		        }
		        double media = soma / 5.0;
		        System.out.println("A m�dia aritm�tica �: " + media);
		        scanner.close();
		    }
		}
