package partie3;

import java.util.Scanner;

public class exercice8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] M = new int[3][3];
		System.out.println("Entrer les éléments de la matrice :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				M[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(M[i][j] +"\t");
			}
			System.out.println();
		}

	}

}
