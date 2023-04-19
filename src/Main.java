import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String inputDayI = sc.nextLine();
		int posEspaco = inputDayI.indexOf(" ");
		String nStr = inputDayI.substring(posEspaco + 1);
		int daysI = Integer.parseInt(nStr);

		String inputTimeI = sc.nextLine();
		String[] partes = inputTimeI.split(":");

		int hoursI = Integer.parseInt(partes[0].trim());
		int minutesI = Integer.parseInt(partes[1].trim());
		int secondsI = Integer.parseInt(partes[2].trim());

		String inputDayF = sc.nextLine();
		posEspaco = inputDayF.indexOf(" ");
		nStr = inputDayF.substring(posEspaco + 1);
		int daysF = Integer.parseInt(nStr);

		String inputTimeF = sc.nextLine();
		partes = inputTimeF.split(":");

		int hoursF = Integer.parseInt(partes[0].trim());
		int minutesF = Integer.parseInt(partes[1].trim());
		int secondsF = Integer.parseInt(partes[2].trim());

		int daysT = daysF - daysI;
		
		int hoursT = hoursF - hoursI;
		if (hoursF < hoursI) {
			hoursT += 24;
			daysT -= 1;
		}

		int minutesT = minutesF - minutesI;
		if (minutesF < minutesI) {
			minutesT += 60;
			hoursT -= 1;
			if (hoursT < 0) {
				hoursT += 24;
				daysT -= 1;
			}
		}
		
		int secondsT = secondsF - secondsI;
		if (secondsF < secondsI) {
			secondsT += 60;
			minutesT -= 1;
			if (minutesT < 0) {
				minutesT += 60;
				hoursT -= 1;
				if (hoursT < 0) {
					hoursT += 24;
					daysT -= 1;
				}
				
			}
		}

		
		System.out.println(daysT + " dia(s)");
		System.out.println(hoursT + " hora(s)");
		System.out.println(minutesT + " minuto(s)");
		System.out.println(secondsT + " segundo(s)");

		sc.close();
	}
}