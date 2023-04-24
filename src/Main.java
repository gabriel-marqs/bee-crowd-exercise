import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] result = new double[n];
		
		for (int i = 0; i < n; i++) {
			double a1 = sc.nextDouble();
			double a2 = sc.nextDouble();
			double a3 = sc.nextDouble();
			
			result[i] = (a1 * 2 + a2 * 3 + a3 * 5) / 10;			
		}
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f%n", result[i]);
		}
		
		
		sc.close();
	}
}
