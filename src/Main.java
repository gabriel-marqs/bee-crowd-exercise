import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		
		for (int i = 1; i <= 9; i = i + 3) {
			for (int j = 7; j > 4; j--) {
				System.out.println("I="+i + " J="+j);
			}
			if (i == 1) {
				i--;
			}
		
		}
	}
}
