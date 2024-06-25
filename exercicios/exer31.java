package exercicios;
import java.util.Scanner;

public class exer31 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o valor do salário-mínimo: R$ ");
		        double salarioMinimo = scanner.nextDouble();

		        System.out.print("Digite o salário do funcionário: R$ ");
		        double salarioFuncionario = scanner.nextDouble();

		        double quantidadeSalarios = salarioFuncionario / salarioMinimo;

		        System.out.println("O funcionário recebe " + quantidadeSalarios + " salários-mínimos.");

		        scanner.close();
		    }
		}
