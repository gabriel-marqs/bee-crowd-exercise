import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double menor, meio, maior;
		boolean formaTriangulo = true;

		if (A > B && A > C) {
			maior = A;
			if (B > C) {
				meio = B;
				menor = C;
			} else {
				meio = C;
				menor = B;
			}
		} else if (B > A && B > C) {
			maior = B;
			if (A > C) {
				meio = A;
				menor = C;
			} else {
				meio = C;
				menor = A;
			}
		}

		else {
			maior = C;
			if (A > B) {
				meio = A;
				menor = B;
			} else {
				meio = B;
				menor = A;
			}
		}

		if (maior >= meio + menor) {
			System.out.println("NAO FORMA TRIANGULO");
			formaTriangulo = false;
		}

		if (formaTriangulo) {

			if (Math.pow(maior, 2) == Math.pow(meio, 2) + Math.pow(menor, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(maior, 2) > (Math.pow(meio, 2) + Math.pow(menor, 2))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(maior, 2) < (Math.pow(meio, 2) + Math.pow(menor, 2))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (A == B && A == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}

			if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) {
				System.out.println("TRIANGULO ISOSCELES");
			}

		}
		sc.close();
	}
}