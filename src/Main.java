import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			num = sc.nextInt();
		} while (num < 1 || num > 12);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM", new java.util.Locale("en"));
		String mes = fmt.format(LocalDate.of(2000, num, 1));

		System.out.println(mes);

		sc.close();

	}
}