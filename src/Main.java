import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n >= 10000) {
			n = sc.nextInt();
		}
		
		int[] list = new int[n];
		
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();		
		}
		
		String pI, pN;
		for (int i = 0; i < n; i++) {
			if (list[i] == 0) {
				System.out.println("null");
			}
			else {
				if (list[i] % 2 == 0) {
					pI = "EVEN";
				}
				else {
					pI = "ODD";
				}
				if (list[i] > 0) {
					pN = "POSITIVE";
				}
				else {
					pN = "NEGATIVE";
				}
				
				System.out.println(pI + " " + pN);
			}
		}
		
		sc.close();
	}
}
