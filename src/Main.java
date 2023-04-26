import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		
		int aux = 7;
		for (int i = 1; i <= 9; i = i + 2) {
			
			for (int j = 3; j > 0; j--) {
				System.out.println("I="+i + " J="+aux);
				aux--;
			}
			aux += 5;		
		}
	}
}
