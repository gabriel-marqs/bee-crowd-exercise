import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int qtd = 0;
		int n = sc.nextInt();

		for (int i = n; qtd < 6; i++) {
			if (i % 2 != 0) {
				qtd++;
				System.out.println(i);
			}
		}

		sc.close();
	}
}
