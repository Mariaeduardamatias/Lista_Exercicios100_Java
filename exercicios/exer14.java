package exercicios;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura da idade em anos, meses e dias
	        System.out.print("Digite a idade em anos: ");
	        int anos = scanner.nextInt();

	        System.out.print("Digite a idade em meses: ");
	        int meses = scanner.nextInt();

	        System.out.print("Digite a idade em dias: ");
	        int dias = scanner.nextInt();

	        // Cálculo do total de dias de vida
	        int totalDias = anos * 365 + meses * 30 + dias;

	        // Exibição do resultado
	        System.out.println("Idade em dias: " + totalDias);

	        scanner.close();
	    }
	}