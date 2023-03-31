import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto = 0; 
		
		if (salario <= 2000) {
			System.out.println("Isento");
			return;
		}
		
		else {
		
		if (salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		}
		
		else if (salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 80; 
		}
		else {
			imposto = ((salario - 4500) * 0.28) + 80 + 270;
		}
		
		System.out.printf("R$ %.2f%n", imposto);
		
		}
		
		sc.close();
	}
}