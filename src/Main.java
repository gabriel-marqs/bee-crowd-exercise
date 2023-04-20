import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n <= 5 || n >= 2000) {
			n = sc.nextInt();
		}
		
		for (int i = 2; i <= n; i = i + 2) {
			double power = Math.pow(i, 2);
			int res = (int) power;
			System.out.printf("%d^2 = %d%n", i, res);
		}
		
		sc.close();
	}
}
