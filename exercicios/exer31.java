package exercicios;
import java.util.Scanner;

public class exer31 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o valor do sal�rio-m�nimo: R$ ");
		        double salarioMinimo = scanner.nextDouble();

		        System.out.print("Digite o sal�rio do funcion�rio: R$ ");
		        double salarioFuncionario = scanner.nextDouble();

		        double quantidadeSalarios = salarioFuncionario / salarioMinimo;

		        System.out.println("O funcion�rio recebe " + quantidadeSalarios + " sal�rios-m�nimos.");

		        scanner.close();
		    }
		}
