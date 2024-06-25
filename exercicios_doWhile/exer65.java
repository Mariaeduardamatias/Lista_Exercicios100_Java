package exercicios_doWhile;

import java.util.Scanner;

public class exer65 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        String nome;
		        int soma = 0, cont = 0;
		        do {
		            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
		            nome = scanner.next();
		            if (nome.equalsIgnoreCase("fim")) break;
		            System.out.print("Digite a idade: ");
		            int idade = scanner.nextInt();
		            soma += idade;
		            cont++;
		        } while (true);
		        if (cont > 0) {
		            double media = soma / (double) cont;
		            System.out.println("A média das idades é: " + media);
		        } else {
		            System.out.println("Nenhuma idade foi inserida.");
		        }
		        scanner.close();
		    }
		}
