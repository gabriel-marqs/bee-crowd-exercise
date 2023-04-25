import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		int quantity = 0;
		int total = 0;
		int ratos = 0;
		int sapos = 0;
		int coelhos = 0;
		char type = 'w';
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] info = line.split(" ");
			quantity = Integer.parseInt(info[0]);
			total += quantity;
			type = info[1].charAt(0);

			if (type == 'C') {
				coelhos += quantity;
			}
			if (type == 'S') {
				sapos += quantity;
			}
			if (type == 'R') {
				ratos += quantity;
			}

		}
		
		double coelhosP = ((double)coelhos / total) * 100;
		double saposP = ((double)sapos / total) * 100;
		double ratosP = ((double)ratos / total) * 100;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n", coelhosP);
		System.out.printf("Percentual de ratos: %.2f %%\n", ratosP);
		System.out.printf("Percentual de sapos: %.2f %%\n", saposP);
		

		sc.close();
	}
}
