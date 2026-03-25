package partie3;

import java.util.Scanner;

public class exercice9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] M = new int[3][3];
		int S = 0;
		System.out.println("Entrer les éléments de la matrice :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				M[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				S = S + M[i][j];
			}
		}
		System.out.print("La somme des éléments de la matrice M est : " +S);

	}

}
