import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];
		int pos = 1;
		
		num[0] = sc.nextInt();
		int maior = num[0];
		for (int i = 1; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] > maior) {
				maior = num[i];
				pos = i + 1;
			}
			
		}
		
		System.out.println(maior);
		System.out.println(pos);

		sc.close();
	}
}
