package exerciciosMatriz;

import java.util.Scanner;

public class exer101 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[4][4];
	        int soma = 0;
	        int quantidade = 16; // 4x4 = 16 elementos
	        
	        System.out.println("Digite os elementos da matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	                soma += matriz[i][j];
	            }
	        }
	        
	        double media = (double) soma / quantidade;
	        System.out.println("Média aritmética dos elementos: " + media);
	        
	        scanner.close();
	    }
	}