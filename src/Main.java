import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int qtd = 0;
		
		for (int i = 0; i < 6; i++) {
			double n = sc.nextDouble();
			if (n > 0) {
				qtd += 1;
			}
		}
		
		System.out.println(qtd + " valores positivos");	
		
		sc.close();
	}
}