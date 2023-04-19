import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] ordenado = new int[3];
		int[] vetor = new int[ordenado.length];
		
		
		for (int i = 0; i < ordenado.length; i++) {
			int n = sc.nextInt();
			ordenado[i] = n;
		}
		
		for (int i = 0; i < ordenado.length; i++) {
			vetor[i] = ordenado[i];
		}
		
		bubbleSort(ordenado);
		
		
		
		
		
		for (int i = 0; i < ordenado.length; i++) {
			System.out.println(ordenado[i]);
		}
		System.out.println();
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		
		sc.close();
	}
	
	public static void bubbleSort(int vetor[]) {
		int aux;
		int tam = vetor.length;

		for (int i = 0; i < tam - 1; i++) {
			for (int j = 0; j < tam - 1 - i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
	}
}

