package exercicios;
import java.util.Scanner;

public class exer32 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a nota do aluno: ");
		        double nota = scanner.nextDouble();

		        String conceito;
		        if (nota >= 9) {
		            conceito = "A";
		        } else if (nota >= 7) {
		            conceito = "B";
		        } else if (nota >= 5) {
		            conceito = "C";
		        } else {
		            conceito = "D";
		        }

		        System.out.println("Conceito: " + conceito);

		        scanner.close();
		    }
		}
