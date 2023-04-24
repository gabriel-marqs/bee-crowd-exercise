import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n < 2 || n >= 1000) {
			n = sc.nextInt();
		}
		
		for (int i = 1; i <= 10; i++) {
			int mult = n * i;
			System.out.printf("%d x %d = %d\n", i, n, mult);
		}
		
		sc.close();
	}
}
