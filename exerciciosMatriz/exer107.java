package exerciciosMatriz;

import java.util.Scanner;

public class exer107 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produtoDiagonalSecundaria = 1;
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i + j == 2) {
                    produtoDiagonalSecundaria *= matriz[i][j];
                }
            }
        }
        
        System.out.println("Produto dos elementos da diagonal secundária: " + produtoDiagonalSecundaria);
        
        scanner.close();
    }
}