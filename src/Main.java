import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Double> notas = new ArrayList<>();
		double n;
		
		for (int i = 0; i < 4; i++) {
			n = sc.nextDouble();
			notas.add(n);
		}
		
		double media = ((notas.get(0) * 2) + (notas.get(1) * 3) + (notas.get(2) * 4) + notas.get(3)) / 10;
		
		if (media >= 7.0) {
			System.out.println(media);
			System.out.println("Aluno aprovado.");
		}
		
		else if (media < 5.0) {
			System.out.println(media);
			System.out.println("Aluno reprovado.");
		}
		
		else {
			System.out.println("Aluno em exame.");
			System.out.print("Nota do exame: ");
			double exame = sc.nextDouble();
			media = (media + exame) / 2;
			
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.println("Media final: " + media);
		}
		
		sc.close();
	}
}