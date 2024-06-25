package exercicios_While;
import java.util.Scanner;

public class exer42 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número inteiro: ");
		        int num = scanner.nextInt();
		        boolean ehPrimo = true;
		        int i = 2;
		        while (i <= num / 2) {
		            if (num % i == 0) {
		                ehPrimo = false;
		                break;
		            }
		            i++;
		        }
		        if (ehPrimo && num > 1) {
		            System.out.println(num + " é um número primo.");
		        } else {
		            System.out.println(num + " não é um número primo.");
		        }
		        scanner.close();
		    }
		}
