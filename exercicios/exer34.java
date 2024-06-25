package exercicios;
import java.util.Scanner;

public class exer34 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a idade da pessoa: ");
		        int idade = scanner.nextInt();

		        if (idade >= 18 && idade <= 70) {
		            System.out.println("O voto é obrigatório.");
		        } else if (idade >= 16 || idade > 70) {
		            System.out.println("O voto é facultativo.");
		        } else {
		            System.out.println("Não pode votar.");
		        }

		        scanner.close();
		    }
		}
