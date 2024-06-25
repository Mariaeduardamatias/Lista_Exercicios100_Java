package exercicios;

import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do peso e altura da pessoa
	        System.out.print("Digite o peso (em kg): ");
	        double peso = scanner.nextDouble();

	        System.out.print("Digite a altura (em metros): ");
	        double altura = scanner.nextDouble();

	        // Cálculo do IMC
	        double imc = peso / (altura * altura);

	        // Exibição do IMC e classificação
	        System.out.println("IMC: " + imc);
	        if (imc < 18.5) {
	            System.out.println("Classificação: Abaixo do peso");
	        } else if (imc < 25) {
	            System.out.println("Classificação: Peso normal");
	        } else if (imc < 30) {
	            System.out.println("Classificação: Sobrepeso");
	        } else {
	            System.out.println("Classificação: Obesidade");
	        }

	        scanner.close();
	    }
	}