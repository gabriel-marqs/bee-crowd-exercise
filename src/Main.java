import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String coluna = sc.next();
		String tipo = sc.next();
		String alimento = sc.next();
		String animal = null; //Exercício não especifica como tratar exceções, decidi portanto retornar null.
		
		String[] colunas = {"vertebrado", "invertebrado"};
		String[] tipos = {"ave", "mamifero", "inseto", "anelideo"};
		String[] alimentos = {"hematofago", "herbivoro", "onivoro", "carnivoro"};

		if (coluna.equals(colunas[0])) {
			if (tipo.equals(tipos[0])) {
				if (alimento.equals(alimentos[3])) {
					animal = "aguia";
				}
				else if (alimento.equals(alimentos[2])) {
					animal = "pombo";
				}
			}
			else if (tipo.equals(tipos[1])) {
				if (alimento.equals(alimentos[2])) {
					animal = "homem";
				}
				else if (alimento.equals(alimentos[1])){
					animal = "vaca";
				}

			}
		}
		else if (coluna.equals(colunas[1])) {
			if (tipo.equals(tipos[2])) {
				if (alimento.equals(alimentos[0])) {
					animal = "pulga";
				}
				else if (alimento.equals(alimentos[1])) {
					animal = "lagarta";
				}

			}
			else if (tipo.equals(tipos[3])) {
				if (alimento.equals(alimentos[0])) {
					animal = "sanguessuga";
				}
				else if (alimento.equals(alimentos[2])) {
					animal = "minhoca";

				}

			}
		}
		
		System.out.println(animal);

		sc.close();
	}

}