import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Double> list = new ArrayList<>();
		int qtd = 0;
		double media = 0;
		
		for (int i = 0; i < 6; i++) {
			double n = sc.nextDouble();
			
			if (n > 0) {
				list.add(n);
				qtd++;
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			media += list.get(i);
		}
		
		media = media / list.size();
		
		System.out.println(qtd + " valores positivos");
		System.out.printf("%.1f\n", media);
		
		sc.close();
	}
}