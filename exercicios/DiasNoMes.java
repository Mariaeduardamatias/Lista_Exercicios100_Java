package exercicios;

import java.util.Scanner;

public class DiasNoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do mês: ");
        String mes = scanner.next().toLowerCase();

        int dias;
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            case "fevereiro":
                dias = 28;
                break;
            default:
                dias = -1; // mês inválido
        }

        if (dias != -1) {
            System.out.println("O mês de " + mes + " tem " + dias + " dias.");
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }
}