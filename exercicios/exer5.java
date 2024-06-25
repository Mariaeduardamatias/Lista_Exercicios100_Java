package exercicios;

import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do preço e quantidade do produto
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        // Cálculo do valor total
        double valorTotal;
        if (quantidade > 10) {
            // Aplicando desconto de 10% se a quantidade for maior que 10 unidades
            valorTotal = preco * quantidade * 0.9;
        } else {
            valorTotal = preco * quantidade;
        }

        // Exibição do resultado
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        scanner.close();
    }

}
