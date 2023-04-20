import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n >= 10000) {
			n = sc.nextInt();
		}
		
		int in = 0;
		int out = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			while (x < Math.pow(-10, 7) && x > Math.pow(10, 7)) {
				x = sc.nextInt();
			}
			if (x >= 10 && x <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
