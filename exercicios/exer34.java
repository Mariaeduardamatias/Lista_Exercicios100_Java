package exercicios;
import java.util.Scanner;

public class exer34 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a idade da pessoa: ");
		        int idade = scanner.nextInt();

		        if (idade >= 18 && idade <= 70) {
		            System.out.println("O voto � obrigat�rio.");
		        } else if (idade >= 16 || idade > 70) {
		            System.out.println("O voto � facultativo.");
		        } else {
		            System.out.println("N�o pode votar.");
		        }

		        scanner.close();
		    }
		}
