package exercicios_While;
import java.util.Scanner;

public class exer43 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número inteiro: ");
		        int num = scanner.nextInt();
		        int a = 0, b = 1, c;
		        System.out.print(a + " " + b);
		        while (true) {
		            c = a + b;
		            if (c > num) break;
		            System.out.print(" " + c);
		            a = b;
		            b = c;
		        }
		        System.out.println();
		        scanner.close();
		    }
		}
