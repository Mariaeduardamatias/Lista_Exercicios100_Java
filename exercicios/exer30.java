package exercicios;
import java.util.Scanner;

public class exer30 {
	
	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o número de maçãs compradas: ");
		        int quantidade = scanner.nextInt();

		        double preco;
		        if (quantidade < 12) {
		            preco = 0.50;
		        } else {
		            preco = 0.40;
		        }

		        double valorTotal = quantidade * preco;

		        System.out.println("Valor total a ser pago: R$ " + valorTotal);

		        scanner.close();
		    }
		}
