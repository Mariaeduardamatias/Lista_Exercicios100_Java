package exercicios;

import java.util.Scanner;

public class exer26 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o código do produto: ");
		        int codigo = scanner.nextInt();

		        System.out.print("Digite a quantidade comprada: ");
		        int quantidade = scanner.nextInt();

		        double preco;
		        switch (codigo) {
		            case 1:
		                preco = 10.0;
		                break;
		            case 2:
		                preco = 15.0;
		                break;
		            case 3:
		                preco = 20.0;
		                break;
		            default:
		                preco = 0.0; // código inválido
		        }

		        double valorTotal = preco * quantidade;

		        if (preco == 0.0) {
		            System.out.println("Código do produto inválido.");
		        } else {
		            System.out.println("Valor total a ser pago: R$ " + valorTotal);
		        }

		        scanner.close();
		    }
		}
