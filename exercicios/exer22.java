package exercicios;

import java.util.Scanner;

public class exer22 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o salário do funcionário: R$ ");
	        double salario = scanner.nextDouble();

	        double bonus;
	        if (salario > 2000) {
	            bonus = salario * 0.10;
	        } else {
	            bonus = salario * 0.05;
	        }

	        System.out.println("O bônus do funcionário é: R$ " + bonus);

	        scanner.close();
	    }
	}