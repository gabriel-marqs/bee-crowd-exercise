import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> impares = new ArrayList<>();
		int n = sc.nextInt();

		while (n < 1 || n > 1000) {
			n = sc.nextInt();
		

		for (int i = n; i > 0; i--) {
			if (i % 2 != 0) {
				impares.add(i);
			}
		}

		for (int i = impares.size() - 1; i >= 0; i--) {
			int aux = impares.get(i);
			System.out.println(aux);
		}
		sc.close();
	}
}
