package exercicios_While;
import java.util.Scanner;

public class exer42 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um n�mero inteiro: ");
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
		            System.out.println(num + " � um n�mero primo.");
		        } else {
		            System.out.println(num + " n�o � um n�mero primo.");
		        }
		        scanner.close();
		    }
		}
