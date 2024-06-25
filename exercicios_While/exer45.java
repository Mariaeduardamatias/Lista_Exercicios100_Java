package exercicios_While;

public class exer45 {

	public static void main(String[] args) {
		
		        int a = 0, b = 1, c, i = 2;
		        System.out.print(a + " " + b);
		        while (i < 20) {
		            c = a + b;
		            System.out.print(" " + c);
		            a = b;
		            b = c;
		            i++;
		        }
		        System.out.println();
		    }
		}
