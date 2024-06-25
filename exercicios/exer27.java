package exercicios;

import java.util.Scanner;

public class exer27 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a idade: ");
		        int idade = scanner.nextInt();

		        System.out.print("Digite o sexo (M/F): ");
		        char sexo = scanner.next().charAt(0);

		        boolean podeAposentar = (sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60);

		        if (podeAposentar) {
		            System.out.println("A pessoa pode se aposentar.");
		        } else {
		            System.out.println("A pessoa não pode se aposentar.");
		        }

		        scanner.close();
		    }
		}
