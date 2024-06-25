package exercicios_doWhile;

public class exer60 {

	public static void main(String[] args) {

		        int a = 0, b = 1, c, i = 2;
		        System.out.print(a + " " + b);
		        do {
		            c = a + b;
		            System.out.print(" " + c);
		            a = b;
		            b = c;
		            i++;
		        } while (i < 20);
		        System.out.println();
		    }
		}
