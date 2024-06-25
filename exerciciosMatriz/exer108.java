package exerciciosMatriz;

import java.util.Scanner;

public class exer108 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[4][4];
	        int[] maiorValorLinha = new int[4];
	        
	        System.out.println("Digite os elementos da matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	                if (j == 0 || matriz[i][j] > maiorValorLinha[i]) {
	                    maiorValorLinha[i] = matriz[i][j];
	                }
	            }
	        }
	        
	        System.out.println("Maior valor presente em cada linha:");
	        for (int i = 0; i < 4; i++) {
	            System.out.println("Linha " + i + ": " + maiorValorLinha[i]);
	        }
	        
	        scanner.close();
	    }
	}