import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (n % 2 == 0) {
				par++;
			}
			if (n % 2 != 0) {
				impar++;
			}
			if (n < 0) {
				negativo++;
			}
			if (n > 0) {
				positivo++;
			}
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
		
		
		sc.close();
	}
}

