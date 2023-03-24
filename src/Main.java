import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double salary = sc.nextDouble();
        double aumento = 0.0;
        int percentual = 0;
        
        if (salary <= 400.0) {
            percentual = 15;
        }
        else if (salary <= 800.0) {
            percentual = 12;
        }
        else if (salary <= 1200.0) {
            percentual = 10;
        }
        else if (salary <= 2000.0) {
            percentual = 7;
        } else if (salary > 2000.0) {
            percentual = 4;
        }
        
        aumento = salary / 100 * percentual;
        salary += aumento;
        
        System.out.printf("Novo salario: %.2f\n", salary);
        System.out.printf("Reajuste ganho: %.2f\n", aumento);
        System.out.printf("Em percentual: %d %%\n", percentual);
        
        sc.close();
    }
 
}