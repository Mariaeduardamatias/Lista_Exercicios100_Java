package exercicios;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura dos n�meros
	        System.out.print("Digite o primeiro n�mero inteiro: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo n�mero inteiro: ");
	        int numero2 = scanner.nextInt();

	        // Opera��es matem�ticas
	        int soma = numero1 + numero2;
	        int subtracao = numero1 - numero2;
	        int multiplicacao = numero1 * numero2;
	        // Verifica��o se o segundo n�mero � diferente de zero para evitar divis�o por zero
	        double divisao = numero2 != 0 ? (double) numero1 / numero2 : 0;

	        // Exibi��o dos resultados
	        System.out.println("Soma: " + soma);
	        System.out.println("Subtra��o: " + subtracao);
	        System.out.println("Multiplica��o: " + multiplicacao);
	        System.out.println("Divis�o: " + divisao);

	        scanner.close();
	    }
}
